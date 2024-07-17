class BarRunner{
public static void main(String barrrr[]){
	boolean val = Bar.addWineBrands("York Arros");
	System.out.println(val);
	Bar.addWineBrands("Sula");
	System.out.println(val);	
	Bar.addWineBrands("Fratelli");
	System.out.println(val);
	Bar.addWineBrands("Zampa");
	System.out.println(val);
	Bar.addWineBrands("krsma");
	System.out.println(val);
	Bar.addWineBrands("big banyan ");
	System.out.println(val);
	Bar.addWineBrands("rythum");
	System.out.println(val);
	Bar.addWineBrands("four seasons");
	System.out.println(val);
	Bar.addWineBrands("vallonne");
	System.out.println(val);
	Bar.addWineBrands("yellow tale");
	System.out.println(val);
	Bar.addWineBrands("ten folds");
	System.out.println(val);
	Bar.addWineBrands("moet");
	System.out.println(val);
	Bar.addWineBrands("garnacha");
	System.out.println(val);
	Bar.addWineBrands("syrah");
	System.out.println(val);
	Bar.addWineBrands("red wine");
	System.out.println(val);
	Bar.addWineBrands("pinot");
	System.out.println(val);
	System.out.println("wine Brands are");
	Bar.getAllBrands();
	Bar.updateWineBrand("Fratelli","changyu");
	System.out.println("after updating");
	Bar.getAllBrands();
	System.out.println("afrer del");
	Bar.delWineBrand("moet");
	Bar.getAllBrands();
	
	

}
}
