package utils.qsim;

import java.util.List;

/**
 * 
 * This class contains all statistical functions
 * 
 * @author Andrey Araujo Masiero
 * @version 1.0 November, 29th 2012
 * 
 */

public class Stats {
	/**
	 * Sum of list
	 * 
	 * @param list
	 *            : list of values to be summed
	 * @return sum: result of the sum
	 */
	public static float sum(List<Float> list) {

		if (list.size() > 0) {

			float sum = 0;

			for (double l : list) {
				sum += l;
			}

			return sum;

		} else {

			return 0;

		}
	}

	/**
	 * Calculus of the list's mean value
	 * 
	 * @param list
	 *            : list of values
	 * @return mean value of the list
	 */
	public static float mean(List<Float> list) {

		return (sum(list) / list.size());

	}

	/**
	 * Standard Deviation Calculus
	 * 
	 * @param list
	 *            : list of values
	 * @return standard deviation value
	 */
	public static float stdDev(List<Float> list) {

		float sum = 0;
		float mean = mean(list);

		for (double l : list) {
			sum += Math.pow((l - mean), 2);
		}

		return (float) Math.sqrt(sum / (list.size() - 1));
	}

	/**
	 * 
	 * Coefficient of Variation calculus
	 * 
	 * @param list
	 *            : list of values
	 * @return coefficient of variation value
	 */
	public static float coefVariation(List<Float> list) {
		return (stdDev(list) / mean(list));
	}

}