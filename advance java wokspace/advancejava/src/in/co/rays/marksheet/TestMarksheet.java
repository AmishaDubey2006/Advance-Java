package in.co.rays.marksheet;

public class TestMarksheet {
	public static void main(String[] args) throws Exception {
		testAdd();
	//	testUpdate();
		// testDelete();
	}

	private static void testDelete() throws Exception {

		MarksheetModel model = new MarksheetModel();
		model.delete(7);
	}

	private static void testUpdate() throws Exception {
		MarksheetBean bean = new MarksheetBean();

		bean.setId(7);
		bean.setName("Deepak");
		bean.setRollNo(107);
		bean.setPhysics(98);
		bean.setChemistry(85);
		bean.setMaths(90);
		bean.setPractical(18);

		MarksheetModel model = new MarksheetModel();

		model.update(bean);
	}

	public static void testAdd() throws Exception {
		MarksheetBean bean = new MarksheetBean();

		bean.setId(7);
		bean.setName("Siya");
		bean.setRollNo(201);
		bean.setPhysics(98);
		bean.setChemistry(85);
		bean.setMaths(90);
		bean.setPractical(18);

		MarksheetModel model = new MarksheetModel();
		model.add(bean);

	}

}
