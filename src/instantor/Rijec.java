package instantor;

/**
 *
 * @author Ivan
 */
public class Rijec {
    
    private String rijec;

	public Rijec(String rijec) {
		this.rijec = rijec;
	}

	public Boolean findSubsequence() {
		Integer length = rijec.length();
		Boolean found = Boolean.FALSE;
                
		for (int i = 0; i < length - 1; i++) {
			char c1 = rijec.charAt(i);
                        
			for (int j = i + 1; j < length; ++j) {
				char c2 = rijec.charAt(j);
				if(c1 == c2) {
                                    
					for(int z = i + 1; z < j; ++z) {
						char cha1 = rijec.charAt(z);
                                                
						for(int x = j + 1; x < length; ++x) {
							char cha2 = rijec.charAt(x);
							if(cha1 == cha2) {
								return Boolean.TRUE;
							}
						}
					}
				}
			}
		}
		return Boolean.FALSE;
	}
}
