package StackProblems;

import stack3130.ArrayStack3130;

import java.util.Objects;

/**
 *
 *
 * Intuition :
 *  isequal = false
 *  while stacka and stack b is not empty as for loop
 *  if stacka.pop == stackb.pop // if in an if statement di this already occurs?
 *      isequal = true
 *      ele = stacka.pop
 *      substack.push(ele)
 * else{
 *     no more opooing
 *
 *     is equal = false
 *
 * }
 * while suckstack is not empty
 *  pop and appemnd to sdtack a and stack b
 *  return boooean
 %rxZJ#TLhvq22ORU
 * @param <E>
 */
public class AreStacksEqual<E> {
    public boolean isEqual(ArrayStack3130<E> s1 , ArrayStack3130<E> s2 ){
       boolean isEqual = true;
       ArrayStack3130<E> substack = new ArrayStack3130<>();
       while (!s1.isEmpty() && !s2.isEmpty()){
           E a = s1.pop();
           E b = s2.pop();
           if (Objects.equals(a,b)){
               substack.push(a);
           } else {
               isEqual = false;
           }

       }
       while(!substack.isEmpty()){
           E ele = substack.pop();
           s1.push(ele);
           s2.push(ele);
       }
        return isEqual;
    }
}
