package egovframework.com;

import java.io.File;
import java.io.IOException;


public class FileReaderFileRename {

	public static final int XBT_TARGET_NAME = 5500;
	public static final String strDirPath = "D:\\KINAC16\\test";
	public static final String[] targetList = {  
			"X00242", "X00243", "X00244", "X00245", "X00246", "X00247", "X00248", "X00249",
			"X00250", "X00251", "X00252", "X00253", "X00254", "X00255", "X00256", "X00257", "X00259", "X00263",
			"X00265", "X00266", "X00267", "X00268", "X00269", "X00270", "X00271", "X00272", "X00273", "X00274",
			"X00275", "X00276", "X00277", "X00278", "X00279", "X00280", "X00282", "X00283", "X00284", "X00305",
			"X00306", "X00308", "X00309", "X00311", "X00312", "X00313", "X00314", "X00316", "X00317", "X00319",
			"X00320", "X00321", "X00322", "X00323", "X00324", "X00325", "X00326", "X00327", "X00328", "X00329",
			"X00330", "X00333", "X00337", "X00339", "X00340", "X00342", "X00344", "X00346", "X00347", "X00349",
			"X00353", "X00354", "X00355", "X00357", "X00358", "X00359", "X00360", "X00361", "X00362", "X00363",
			"X00364", "X00377", "X00378", "X00379", "X00380", "X00381", "X00385", "X00389", "X00393", "X00394",
			"X00395", "X00396", "X00397", "X00400", "X00401", "X00402", "X00405", "X00406", "X00408", "X00425",
			"X00426", "X00427", "X00428", "X00429", "X00430", "X00431", "X00432", "X00433", "X00434", "X00435",
			"X00436", "X00437", "X00438", "X00439", "X00440", "X00441", "X00442", "X00444", "X00445", "X00446",
			"X00447", "X00448", "X00449", "X00450", "X00451", "X00452", "X00453", "X00454", "X00457", "X00458",
			"X00459", "X00460", "X00461", "X00462", "X00464", "X00473", "X00475", "X00476", "X00477", "X00478",
			"X00479", "X00480", "X00486", "X00488", "X00493", "X00495", "X00496", "X00498", "X00499", "X00501",
			"X00502", "X00503", "X00504", "X00505", "X00506", "X00507", "X00517", "X00537", "X00538", "X00539",
			"X00540", "X00541", "X00544", "X00562", "X00563", "X00564", "X00566", "X00568", "X00570", "X00575",
			"X00605", "X00606", "X00607", "X00608", "X00649", "X00650", "X00651", "X00652", "X00653", "X00654",
			"X00655", "X00656", "X00657", "X00658", "X00659", "X00660", "X00661", "X00662", "X00663", "X00664",
			"X00665", "X00666", "X00667", "X00668", "X00677", "X00678", "X00679", "X00680", "X00681", "X00682",
			"X00683", "X00684", "X00685", "X00686", "X00687", "X00688", "X00689", "X00690", "X00691", "X00692",
			"X00693", "X00694", "X00695", "X00696", "X00697", "X00698", "X00699", "X00700", "X00701", "X00702",
			"X00703", "X00704", "X00705", "X00706", "X00707", "X00708", "X00709", "X00710", "X00711", "X00712",
			"X00713", "X00714", "X00715", "X00716", "X00717", "X00718", "X00719", "X00720", "X00721", "X00722",
			"X00723", "X00724", "X00725", "X00726", "X00727", "X00728", "X00729", "X00730", "X00731", "X00732",
			"X00733", "X00734", "X00735", "X00736", "X00737", "X00738", "X00739", "X00740", "X00741", "X00742",
			"X00743", "X00744", "X00745", "X00746", "X00747", "X00748", "X00749", "X00750", "X00751", "X00752",
			"X00757", "X00758", "X00759", "X00760", "X00761", "X00762", "X00763", "X00764", "X00765", "X00766",
			"X00767", "X00768", "X00769", "X00770", "X00771", "X00772", "X00773", "X00774", "X00775", "X00776",
			"X00777", "X00778", "X00779", "X00780", "X00781", "X00782", "X00785", "X00786", "X00787", "X00788",
			"X00793", "X00794", "X00795", "X00796", "X00797", "X00798", "X00799", "X00800", "X00809", "X00810",
			"X00811", "X00812", "X00813", "X00814", "X00815", "X00816", "X00817", "X00818", "X00819", "X00820",
			"X00821", "X00822", "X00823", "X00824", "X00825", "X00826", "X00827", "X00828", "X00829", "X00830",
			"X00831", "X00832", "X00833", "X00834", "X00835", "X00836", "X00845", "X00846", "X00847", "X00848",
			"X00849", "X00850", "X00851", "X00852", "X00853", "X00854", "X00855", "X00856", "X00857", "X00858",
			"X00859", "X00860", "X00861", "X00862", "X00863", "X00864", "X00865", "X00866", "X00867", "X00868",
			"X00921", "X00922", "X00923", "X00924", "X00945", "X00946", "X00947", "X00948" };	

	public static String seqId = "";
	public static int ti = 0;
	public static void main(String[] args) throws IOException {
		// String strDirPath = "D:\\KINAC16\\인천공항리네임_wbt_image\\xray-1(renamed)";
		
		/*
		File[] folderList = ListFolder(strDirPath);
		
		System.out.println("result count : " + folderList.length);
		String seqId = "";
		for (int i = 0; i < folderList.length; i++) {
			//System.out.println("result : " + fileList[i].getName());
			seqId = String.format("X%05d", (XBT_TARGET_NAME + i));
			File newFile = new File(strDirPath + File.separator + seqId);
		
			for (int j = 0; j < targetList.length; j++) {
				if(folderList[i].getName().contains(targetList[j])) {
					folderList[i].renameTo(newFile);		
				}
			}
		}*/
		
		
		File[] fileList = ListFile(strDirPath);
	}

	
	// 재귀함수 파일
	private static File[] ListFile(String strDirPath) {
		File path = new File(strDirPath);
		File[] fList = path.listFiles();
		for (int i = 0; i < fList.length; i++) {
			if (fList[i].isFile()) {
				String beforeId = fList[i].getParent().substring(fList[i].getParent().length()-6, fList[i].getParent().length());
				System.out.println("파일:"+fList[i].getPath()); // 파일의 FullPath 출력
				System.out.println("파일폴더아이디:"+fList[i].getParent().substring(fList[i].getParent().length()-6, fList[i].getParent().length()));
				//targetList[i]
		        //String fileNameWithoutExtension = FilenameUtils.removeExtension(fList[i].getPath());
		        //String fileExtension = StringUtils.getFilenameExtension(fList[i].getPath());
		        
				for (int j = 0; j < targetList.length; j++) {
					if(beforeId.contains(targetList[j])) {
						File newXray = new File(strDirPath + File.separator + seqId + fList[i].getName().substring(6));// 신규아이디 + "-103.jpg"
						fList[i].renameTo(newXray);		
					}
				}
				
				
			} else if (fList[i].isDirectory()) {
				File newFile = new File("");
				boolean resultFlag = false;
				for (int j = 0; j < targetList.length; j++) {
					if(fList[i].getName().contains(targetList[j])) {
						seqId = String.format("X%05d", (XBT_TARGET_NAME + ti));
						newFile = new File(strDirPath + File.separator + seqId);		
						resultFlag = true;
						ti++;
					}
				}
				
				
				// byte변환
				ListFile(fList[i].getPath()); // 재귀함수 호출
				
				if(resultFlag) {
					fList[i].renameTo(newFile);		
				}
			}
		}
		return fList;
	}
}