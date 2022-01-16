#include <bits/stdc++.h>
using namespace std;

vector<string> solution(vector<string> Record) { 
    vector<string> RecordLog;     
    vector<string> Answer;        
    vector<pair<string,char>> ParsingString;        
    map<string,string> MapTable;                    
    for(int i=0;i<Record.size();i++){               
        string TempString="";                       
        for(int j=0;j<Record[i].length();j++){      
            if(Record[i][j]==' '|| j==Record[i].length()-1){            
                if(j==Record[i].length()-1)TempString+=Record[i][j];    
                RecordLog.push_back(TempString);  
                TempString="";                    
                continue;                         
            }
            TempString+=Record[i][j];             
        }
    }
    for(int i=0;i<RecordLog.size();){             
        if(RecordLog[i][0]=='E'){                 
            ParsingString.push_back({RecordLog[i+1],'E'});    
            MapTable[RecordLog[i+1]]=RecordLog[i+2];          
            i+=3;       
        }
        else if(RecordLog[i][0]=='L'){      
            ParsingString.push_back({RecordLog[i+1],'L'});   
            i+=2;       
        }
        else if(RecordLog[i][0]=='C'){        
            MapTable[RecordLog[i+1]]=RecordLog[i+2];       
            i+=3;      
        }
    }
    for(int i=0;i<ParsingString.size();i++){       
        string TempString;        
        if(ParsingString[i].second=='E')TempString=MapTable[ParsingString[i].first]+"님이 들어왔습니다."; 
        if(ParsingString[i].second=='L')TempString=MapTable[ParsingString[i].first]+"님이 나갔습니다.";   
        Answer.push_back(TempString);  
    }
    return Answer;    
}