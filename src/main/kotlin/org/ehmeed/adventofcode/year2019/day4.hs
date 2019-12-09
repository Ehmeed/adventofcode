part1 = length ([a | a <- [124074..580769],
                 isIncreasing (digits a),
                 hasSameAdjacent (digits a)])

part2 = length ([a | a <- [124074..580769],
                 isIncreasing (digits a),
                 ha (digits a )])

isIncreasing :: (Ord a) => [a] -> Bool
isIncreasing [] = True
isIncreasing (a:[]) = True
isIncreasing (a:b:[]) = a <= b
isIncreasing (a:b:c) = a <= b && isIncreasing (b:c)


digits' :: (Integral a) => a -> [a]
digits' 0 = []
digits' x = digits' (x `div` 10) ++ [x `mod` 10]

digits :: (Integral a) => a -> [a]
digits 0 = [0]
digits x = digits' x


hasSameAdjacent :: (Integral a) => [a] -> Bool
hasSameAdjacent [] = False
hasSameAdjacent (a:[]) = False
hasSameAdjacent (a:b:[]) = a == b
hasSameAdjacent (a:b:c) = a == b || hasSameAdjacent (b:c)


ha' :: (Integral a) => [a] -> a -> Bool
ha' (a:b:[]) x = a == b && a /= x
ha' (a:b:c:rest) x = ((a == b) && b /= c && a /= x) || ha' (b:c:rest) a
ha' _ _ = False


ha :: (Integral a) => [a] -> Bool
ha a@(x:xs) = ha' a (x+1)
ha _= False
