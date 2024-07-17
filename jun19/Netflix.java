class Netflix{
	static String topMovies[] = {hey,"Kai Po Che!","Vunnadhi Okate Zindagi","Billu","3 Idiots","Yeh Jawaani Hai Deewani","Arya 2","Dil Chahta Hai","Studen of the year","Ae Dil Hai Mushkil"};
	static String hey.topMovies ={"Zindagi Na Milegi Dobara"};
	static String englishMovies[] ={"Godzilla x Kong: The New Empire","Dune: Part Two","Oppenheimer","The Fall Guy","Tarot","The Exorcist","The Green Mile","Taxi Driver","Blood Diamomd","The Prestige","Braveheart","Gran Torino","Scent of a Woman","To kill a Mockingbird","Tha Dark KNight","Joker","Raging Bull","Goodfellas","Catch me if you can","Inception","The Matrix","The Departed","Interseller","Challengers","The Sixth Sense","Peaky Blenders"};
	static String kannadaMovies[]= {"Kantara","Annaatthe","U turn","RRR","Govinda Govinda","Ayana","The Trader","Mundina Nildana","My Happy Family","Kavacham","Ondu motteya kate","Rama rama re","Thithi","Urvi","Shuddhi","The Plan","kahi","Hombanna","Hi Nanna","Guntur Karam","Salaar","Beast","Leo","Jawan","Animal","Kushi"};
	static String hindiMoviesOrSeries[]= {"Mismatched","Little Things","The Kota Factroy","Tamasha","Dear ZIndagi","Never Have i Ever","Darlings","Mili","Article 370","Om Sahnthi om","crew","Laapatha Ladies","Fighter","Heeramandi","Major","Raw","Bastar","Mission Majnu","heeramandi","GanguBia Khatiawadi","Kapoor and Sons","Raazi","Tu Jhooti mai Makkar","Merry Chrismas","Hit","badla","Crew"};
	static String koreanMoviesOrSeries[]= {"Hierachy","Queen of Tears","King of land","Busines Proposal","20th Century Girl","Hidden Love","My Demon","Destined with you","Crash landing on you","True Bueaty","The King","Its okay to not be okay","Twenty Five twenty one","Crash Course in Romance","Falling into your Smile","A time called you","whats Wrong with Secreteray kim","See you in my 19th life","First Love","Tune in for Love","Romance is a bonus book","I hear your Voice","Doctor Stranger","Celegrity","xyz"};
	public static void main(String args[]){
		System.out.println("Top movies are:");
		for(String topMovieList:topMovies)
		{
			System.out.println(topMovieList);
		}
		System.out.println("----------------------");
		System.out.println("English movies are:");
		for(String englishMoviesList:englishMovies)
		{
			System.out.println(englishMoviesList);
		}
		System.out.println("----------------------");
		System.out.println("Kannada movies are:");
		for(String kannadaMoviesList:kannadaMovies)
		{
			System.out.println(kannadaMoviesList);
		}
		System.out.println("----------------------");
		System.out.println("Hindi movies or series:");
		for(String hindiMoviesOrSeriesList:hindiMoviesOrSeries)
		{
			System.out.println(hindiMoviesOrSeriesList);
		}
		System.out.println("----------------------");
		System.out.println("Korean movies or Series:");
		for(String koreanMoviesOrSeriesList:koreanMoviesOrSeries)
		{
			System.out.println(koreanMoviesOrSeriesList);
		}
		
	/*
	System.out.println("Movies:\n" + topMovies[0] + "\n" +topMovies[1]+ "\n" +topMovies[2]+ "\n" +topMovies[3]+ "\n" +topMovies[4]+ "\n" +topMovies[5]+ "\n" +topMovies[6]+ "\n" +topMovies[7]+ "\n" +topMovies[8]+ "\n" +topMovies[9]);
	System.out.println("----------------------");
	System.out.println("English Movies:\n" + englishMovies[0] + "\n" + englishMovies[1] + "\n" + englishMovies[2] + "\n" + englishMovies[3] + "\n" +englishMovies[4] + "\n" + englishMovies[5] + "\n" +englishMovies[6]+ "\n" +englishMovies[7]+ "\n" +englishMovies[8]+ "\n" +englishMovies[9]+ "\n" +englishMovies[10]+ "\n" +englishMovies[11]+ "\n" +englishMovies[12]+ "\n" +englishMovies[13]+ "\n" +englishMovies[14]+ "\n" +englishMovies[15]+ "\n" +englishMovies[16]+ "\n" +englishMovies[17]+ "\n" +englishMovies[18]+ "\n" +englishMovies[19]+ "\n" +englishMovies[20]+ "\n" +englishMovies[21]+ "\n" +englishMovies[22]+ "\n" +englishMovies[23]+ "\n" +englishMovies[24]);
	System.out.println("----------------------");
	System.out.println("Kannada Movies:\n" +kannadaMovies[0]+ "\n" +kannadaMovies[1]+ "\n" +kannadaMovies[2]+ "\n" +kannadaMovies[3]+ "\n" +kannadaMovies[4]+ "\n" +kannadaMovies[5]+ "\n" +kannadaMovies[6]+ "\n" +kannadaMovies[7]+ "\n" +kannadaMovies[8]+ "\n" +kannadaMovies[9]+ "\n" +kannadaMovies[10]+ "\n" +kannadaMovies[11]+ "\n" +kannadaMovies[12]+ "\n" +kannadaMovies[13]+ "\n" +kannadaMovies[14]+ "\n" +kannadaMovies[15]+ "\n" +kannadaMovies[16]+ "\n" +kannadaMovies[17]+ "\n" +kannadaMovies[18]+ "\n" +kannadaMovies[19]+ "\n" +kannadaMovies[20]+ "\n" +kannadaMovies[21]+ "\n" +kannadaMovies[22]+ "\n" +kannadaMovies[23]+ "\n" +kannadaMovies[24]);
	System.out.println("----------------------");
	System.out.println("Hindi Movies:\n" +hindiMoviesOrSeries[0]+ "\n" +hindiMoviesOrSeries[1]+ "\n" +hindiMoviesOrSeries[2]+ "\n" +hindiMoviesOrSeries[3]+ "\n" +hindiMoviesOrSeries[4]+ "\n" +hindiMoviesOrSeries[5]+ "\n" +hindiMoviesOrSeries[6]+ "\n" +hindiMoviesOrSeries[7]+ "\n" +hindiMoviesOrSeries[8]+ "\n" +hindiMoviesOrSeries[9]+ "\n" +hindiMoviesOrSeries[10]+ "\n" +hindiMoviesOrSeries[11]+ "\n" +hindiMoviesOrSeries[12]+ "\n" +hindiMoviesOrSeries[13]+ "\n" +hindiMoviesOrSeries[14]+ "\n" +hindiMoviesOrSeries[15]+ "\n" +hindiMoviesOrSeries[16]+ "\n" +hindiMoviesOrSeries[17]+ "\n" +hindiMoviesOrSeries[18]+ "\n" +hindiMoviesOrSeries[19]+ "\n" +hindiMoviesOrSeries[20]+ "\n" +hindiMoviesOrSeries[21]+ "\n" +hindiMoviesOrSeries[22]+ "\n" +hindiMoviesOrSeries[23]+ "\n" +hindiMoviesOrSeries[24]);
	System.out.println("----------------------");
	System.out.println("Korean Movies:\n" +koreanMoviesOrSeries[0]+ "\n" +koreanMoviesOrSeries[1]+ "\n" +koreanMoviesOrSeries[2]+ "\n" +koreanMoviesOrSeries[3]+ "\n" +koreanMoviesOrSeries[4]+ "\n" +koreanMoviesOrSeries[5]+ "\n" +koreanMoviesOrSeries[6]+ "\n" +koreanMoviesOrSeries[7]+ "\n" +koreanMoviesOrSeries[8]+ "\n" +koreanMoviesOrSeries[9]+ "\n" +koreanMoviesOrSeries[10]+ "\n" +koreanMoviesOrSeries[11]+ "\n" +koreanMoviesOrSeries[12]+ "\n" +koreanMoviesOrSeries[13]+ "\n" +koreanMoviesOrSeries[14]+ "\n" +koreanMoviesOrSeries[15]+ "\n" +koreanMoviesOrSeries[16]+ "\n" +koreanMoviesOrSeries[17]+ "\n" +koreanMoviesOrSeries[18]+ "\n" +koreanMoviesOrSeries[19]+ "\n" +koreanMoviesOrSeries[20]+ "\n" +koreanMoviesOrSeries[21]+ "\n" +koreanMoviesOrSeries[22]+ "\n" +koreanMoviesOrSeries[23]);
	*/
}
}
