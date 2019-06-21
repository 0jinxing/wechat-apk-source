package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public class EmotionDetail extends com.tencent.mm.bt.a
{
  public String ConsumeProductID;
  public String CoverUrl;
  public EmotionDesigner EmotionDesigner;
  public String IconUrl;
  public String OldRedirectUrl;
  public String PackAuthInfo;
  public String PackCopyright;
  public String PackDesc;
  public int PackExpire;
  public int PackFlag;
  public String PackName;
  public String PackPrice;
  public int PackThumbCnt;
  public LinkedList<bts> PackThumbList;
  public int PackType;
  public String PanelUrl;
  public PersonalDesigner PersonalDesigner;
  public String PriceNum;
  public String PriceType;
  public String ProductID;
  public String ShareDesc;
  public int ThumbExtCount;
  public LinkedList<PackThumbExt> ThumbExtList;
  public String TimeLimitStr;
  public int Version;

  public EmotionDetail()
  {
    AppMethodBeat.i(62540);
    this.PackThumbList = new LinkedList();
    this.ThumbExtList = new LinkedList();
    AppMethodBeat.o(62540);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(62541);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ProductID != null)
        paramArrayOfObject.e(1, this.ProductID);
      if (this.IconUrl != null)
        paramArrayOfObject.e(2, this.IconUrl);
      if (this.PackName != null)
        paramArrayOfObject.e(3, this.PackName);
      if (this.PackDesc != null)
        paramArrayOfObject.e(4, this.PackDesc);
      if (this.PackAuthInfo != null)
        paramArrayOfObject.e(5, this.PackAuthInfo);
      if (this.PackPrice != null)
        paramArrayOfObject.e(6, this.PackPrice);
      paramArrayOfObject.iz(7, this.PackType);
      paramArrayOfObject.iz(8, this.PackFlag);
      paramArrayOfObject.iz(9, this.PackThumbCnt);
      paramArrayOfObject.e(10, 8, this.PackThumbList);
      if (this.CoverUrl != null)
        paramArrayOfObject.e(11, this.CoverUrl);
      paramArrayOfObject.iz(12, this.PackExpire);
      if (this.PackCopyright != null)
        paramArrayOfObject.e(13, this.PackCopyright);
      if (this.PriceNum != null)
        paramArrayOfObject.e(14, this.PriceNum);
      if (this.PriceType != null)
        paramArrayOfObject.e(15, this.PriceType);
      if (this.PanelUrl != null)
        paramArrayOfObject.e(16, this.PanelUrl);
      if (this.ConsumeProductID != null)
        paramArrayOfObject.e(17, this.ConsumeProductID);
      paramArrayOfObject.iz(18, this.ThumbExtCount);
      paramArrayOfObject.e(19, 8, this.ThumbExtList);
      paramArrayOfObject.iz(20, this.Version);
      if (this.TimeLimitStr != null)
        paramArrayOfObject.e(21, this.TimeLimitStr);
      if (this.ShareDesc != null)
        paramArrayOfObject.e(22, this.ShareDesc);
      if (this.OldRedirectUrl != null)
        paramArrayOfObject.e(23, this.OldRedirectUrl);
      if (this.EmotionDesigner != null)
      {
        paramArrayOfObject.iy(24, this.EmotionDesigner.computeSize());
        this.EmotionDesigner.writeFields(paramArrayOfObject);
      }
      if (this.PersonalDesigner != null)
      {
        paramArrayOfObject.iy(25, this.PersonalDesigner.computeSize());
        this.PersonalDesigner.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(62541);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ProductID == null)
        break label2037;
    label2037: for (i = e.a.a.b.b.a.f(1, this.ProductID) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.IconUrl != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.IconUrl);
      i = paramInt;
      if (this.PackName != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.PackName);
      int j = i;
      if (this.PackDesc != null)
        j = i + e.a.a.b.b.a.f(4, this.PackDesc);
      paramInt = j;
      if (this.PackAuthInfo != null)
        paramInt = j + e.a.a.b.b.a.f(5, this.PackAuthInfo);
      i = paramInt;
      if (this.PackPrice != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.PackPrice);
      i = i + e.a.a.b.b.a.bs(7, this.PackType) + e.a.a.b.b.a.bs(8, this.PackFlag) + e.a.a.b.b.a.bs(9, this.PackThumbCnt) + e.a.a.a.c(10, 8, this.PackThumbList);
      paramInt = i;
      if (this.CoverUrl != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.CoverUrl);
      i = paramInt + e.a.a.b.b.a.bs(12, this.PackExpire);
      paramInt = i;
      if (this.PackCopyright != null)
        paramInt = i + e.a.a.b.b.a.f(13, this.PackCopyright);
      i = paramInt;
      if (this.PriceNum != null)
        i = paramInt + e.a.a.b.b.a.f(14, this.PriceNum);
      paramInt = i;
      if (this.PriceType != null)
        paramInt = i + e.a.a.b.b.a.f(15, this.PriceType);
      i = paramInt;
      if (this.PanelUrl != null)
        i = paramInt + e.a.a.b.b.a.f(16, this.PanelUrl);
      paramInt = i;
      if (this.ConsumeProductID != null)
        paramInt = i + e.a.a.b.b.a.f(17, this.ConsumeProductID);
      i = paramInt + e.a.a.b.b.a.bs(18, this.ThumbExtCount) + e.a.a.a.c(19, 8, this.ThumbExtList) + e.a.a.b.b.a.bs(20, this.Version);
      paramInt = i;
      if (this.TimeLimitStr != null)
        paramInt = i + e.a.a.b.b.a.f(21, this.TimeLimitStr);
      i = paramInt;
      if (this.ShareDesc != null)
        i = paramInt + e.a.a.b.b.a.f(22, this.ShareDesc);
      j = i;
      if (this.OldRedirectUrl != null)
        j = i + e.a.a.b.b.a.f(23, this.OldRedirectUrl);
      paramInt = j;
      if (this.EmotionDesigner != null)
        paramInt = j + e.a.a.a.ix(24, this.EmotionDesigner.computeSize());
      i = paramInt;
      if (this.PersonalDesigner != null)
        i = paramInt + e.a.a.a.ix(25, this.PersonalDesigner.computeSize());
      AppMethodBeat.o(62541);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.PackThumbList.clear();
        this.ThumbExtList.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(62541);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        EmotionDetail localEmotionDetail = (EmotionDetail)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62541);
          break;
        case 1:
          localEmotionDetail.ProductID = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62541);
          paramInt = i;
          break;
        case 2:
          localEmotionDetail.IconUrl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62541);
          paramInt = i;
          break;
        case 3:
          localEmotionDetail.PackName = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62541);
          paramInt = i;
          break;
        case 4:
          localEmotionDetail.PackDesc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62541);
          paramInt = i;
          break;
        case 5:
          localEmotionDetail.PackAuthInfo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62541);
          paramInt = i;
          break;
        case 6:
          localEmotionDetail.PackPrice = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62541);
          paramInt = i;
          break;
        case 7:
          localEmotionDetail.PackType = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62541);
          paramInt = i;
          break;
        case 8:
          localEmotionDetail.PackFlag = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62541);
          paramInt = i;
          break;
        case 9:
          localEmotionDetail.PackThumbCnt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62541);
          paramInt = i;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localEmotionDetail.PackThumbList.add(paramArrayOfObject);
          }
          AppMethodBeat.o(62541);
          paramInt = i;
          break;
        case 11:
          localEmotionDetail.CoverUrl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62541);
          paramInt = i;
          break;
        case 12:
          localEmotionDetail.PackExpire = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62541);
          paramInt = i;
          break;
        case 13:
          localEmotionDetail.PackCopyright = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62541);
          paramInt = i;
          break;
        case 14:
          localEmotionDetail.PriceNum = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62541);
          paramInt = i;
          break;
        case 15:
          localEmotionDetail.PriceType = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62541);
          paramInt = i;
          break;
        case 16:
          localEmotionDetail.PanelUrl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62541);
          paramInt = i;
          break;
        case 17:
          localEmotionDetail.ConsumeProductID = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62541);
          paramInt = i;
          break;
        case 18:
          localEmotionDetail.ThumbExtCount = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62541);
          paramInt = i;
          break;
        case 19:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new PackThumbExt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((PackThumbExt)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localEmotionDetail.ThumbExtList.add(localObject1);
          }
          AppMethodBeat.o(62541);
          paramInt = i;
          break;
        case 20:
          localEmotionDetail.Version = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62541);
          paramInt = i;
          break;
        case 21:
          localEmotionDetail.TimeLimitStr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62541);
          paramInt = i;
          break;
        case 22:
          localEmotionDetail.ShareDesc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62541);
          paramInt = i;
          break;
        case 23:
          localEmotionDetail.OldRedirectUrl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62541);
          paramInt = i;
          break;
        case 24:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new EmotionDesigner();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localEmotionDetail.EmotionDesigner = paramArrayOfObject;
          }
          AppMethodBeat.o(62541);
          paramInt = i;
          break;
        case 25:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new PersonalDesigner();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((PersonalDesigner)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localEmotionDetail.PersonalDesigner = ((PersonalDesigner)localObject1);
          }
          AppMethodBeat.o(62541);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(62541);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.EmotionDetail
 * JD-Core Version:    0.6.2
 */