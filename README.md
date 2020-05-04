# Painting-the-building-Dynamic-Programming

There are N buildings in a locality each building must be painted with a type of paint. InitiaIly, some buildings are painted with some type of paint. The building that is painted cannot be painted again. You are given M types a paints, 1 to M inclusive. The specialty 0f the locality is defined as the number of contiguous buildings that are painted with the same type of paint. For example, if six buildings apartment are painted from left to right are {1, 2, 1, 1, 3, 3}, then the likelihood of the apartment is 4 { {1}, {2}, {1,1}, and {3,3}}. You are given an N x M matrix, where the ith row and jth column denote the painting cost of the ith building with the jth the type of paint.

You are required to determine the minimum cost to paint all the buildings such that the specialty of the appartment is exactly K. If it is not possible to paint all building such that the likelihood of the apartment is exactly K, then print -1.

Input Format : --> The first line contains T denoting the number of test cases.

-> For each test case:

–> The next line contains N, M, and K where N is the number of buildings in a locality , M is the number of types of paints, and K is the specialty of the locality respectively.

–> The next line contains N space-separated integers where the ith integer is either 0 or the type of paint from which the ith building is already painted. Here, 0 means that the building is not painted.

–> The next N lines contain M space-separated integers where the ith row and jth column denote the painting cost (cost i,j of the ith building with the jth type of paint.

OUTPUT FORMAT :

Print the minimum cost to paint all buildings such that the specialty of the apartment is exactly K. If it is not possible to paint all building such that the likelihood of the apartment is exactly K, then print -1.

CONSTRAINTS :

1 ≤ T ≤ 10
1 ≤ K ≤ N ≤ 100 
1 ≤ M ≤ 100
1 ≤ cost(i,j) ≤ 10 power 9
SAMPLE INPUT :

1

4 2 1

0 0 0 2

100 20

30 59

71 81

9 200

SAMPLE OUTPUT :

160
