# Group Project 1 - Global Taxing 

## Team size
3 or 4 team members (no 2-member or 5-member team) with a team leader who responsible for coordination and submit the final package, which include all the codes and a report. 

Allocate 25 total points with 5 bonus points for APP creation. 

Due date is 30 November. 

## Key requirement
Key requirement for this project is that there should be no free rider – every team members must participate in the completion of this project and mention his or her contribution.  

If any one who did not make any contribution, please just mention his name at the beginning of the report with consent of other team members.   

## Instruction
For this project, each group needs to implement a C++ system to calculate global taxing (additional tax to pay to IRS USA) for someone who holds US citizenship or green card but has income from either Hong Kong or Macau or both.  

Please do let the user choose:

- Income sources (HKD, MOP, or both, or even with USD income as well) 

- Status (Single or Married) 

- Age for Macau (if Age >= 65, then exemption amount is different)

Also, do allow user to enter income amount in (HKD, MOP, and USD) and exchange rates between USD and HKD as well as USD and MOP.  

![image](https://i.loli.net/2019/11/30/UBcwpnvaIFPYKMf.png)   

Tax in Hong Kong

![image](https://i.loli.net/2019/11/30/VP8RvjhGCobxfdM.png)

Tax in Macau

All the tax bracket (tax rates) already provided in the documents that I sent to you before or you can find them at some government website.  

Please do also search for additional information to improve your system as close as possible to the actual situation in the real world, for example, for total income less than a certain level, no global taxing will be charged. 

Besides the program or code, please do prepare a documentation to describe your system that also include, for example, user manual or frequent asked question (FAQ).

Also, on your code, please use the proper format, like indentation, and do make sure that you provide sufficient comments or explanation to let other people to know how to follow the code that you wrote.   

## Bonus Point
For the bonus point part, please create an APP for your Global Tax Calculation, do pay attention to the user interface design for user to conveniently input their data and read the output.

## 工作分配
浩:

## Additional information
![image](https://i.loli.net/2019/11/30/UBcwpnvaIFPYKMf.png)   

Tax in Hong Kong

![image](https://i.loli.net/2019/11/30/VP8RvjhGCobxfdM.png)

Tax in Macau

### Tax in US
美国的个税根据收入分成10%、15%、25%、28%、33%、35%以及39.6%共7个等级。其划分标准如下。

单身收入：
0 — 9275美元，税率10%   
9276 — 37650美元，税率15%   
37651—91150美元，税率 25%   
91151—190150美元，税率 28%  
190151—413350美元， 税率 33%  
413351—415050美元，税率35%  
415050美元以上，税率39.6%  

夫妻合报（也可以分开报税，但税率不一样）
0—18550美元，税率10%  
18551—75300美元，税率15%  
75301—151900美元，税率25%  
151901—231450美元，税率28%  
231451—413350美元，税率33%  
413351—466950美元，税率35%  
466950美元以上，税率39.6%  

美国的个税税率采取的是大部分国家通用的累进税制，以夫妻合并报税为例，家庭年收入在18550美元以下的，税率为10%；收入在18551美元到75300美元之间的，税率15%。需要指出的是，收入在18551美元以上的家庭，并非所有收入全部按15%计算，其中18550美元按10%税率计算，超过部分才按15%的标准计算。

Sample Code:
```cpp
# include <iostream.h>

using name space std;
void main ()
( 
    string answer1,answer2,reply
    answer1=yes
    answer2=np
    cout<<"Are you married? if so would you like to report your tax with your husband or wife?\n\n:";
    cin>>reply;
    if((reply==answer1) || (reply==answer2))
}
```