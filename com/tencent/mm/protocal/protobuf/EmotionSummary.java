package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class EmotionSummary extends com.tencent.mm.bt.a
{
  public String CoverUrl;
  public String ExptDesc;
  public String IconUrl;
  public String Introduce;
  public String PackAuthInfo;
  public String PackCopyright;
  public String PackDesc;
  public int PackExpire;
  public int PackFlag;
  public String PackName;
  public String PackPrice;
  public int PackType;
  public String PanelUrl;
  public String PriceNum;
  public String PriceType;
  public String ProductID;
  public String SendInfo;
  public String TagUri;
  public String TimeLimitStr;
  public int Timestamp;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(62545);
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
      if (this.CoverUrl != null)
        paramArrayOfObject.e(9, this.CoverUrl);
      paramArrayOfObject.iz(10, this.PackExpire);
      if (this.PackCopyright != null)
        paramArrayOfObject.e(11, this.PackCopyright);
      paramArrayOfObject.iz(12, this.Timestamp);
      if (this.PanelUrl != null)
        paramArrayOfObject.e(13, this.PanelUrl);
      if (this.PriceNum != null)
        paramArrayOfObject.e(14, this.PriceNum);
      if (this.PriceType != null)
        paramArrayOfObject.e(15, this.PriceType);
      if (this.SendInfo != null)
        paramArrayOfObject.e(16, this.SendInfo);
      if (this.TimeLimitStr != null)
        paramArrayOfObject.e(17, this.TimeLimitStr);
      if (this.Introduce != null)
        paramArrayOfObject.e(18, this.Introduce);
      if (this.TagUri != null)
        paramArrayOfObject.e(19, this.TagUri);
      if (this.ExptDesc != null)
        paramArrayOfObject.e(20, this.ExptDesc);
      AppMethodBeat.o(62545);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ProductID == null)
        break label1392;
    label1392: for (i = e.a.a.b.b.a.f(1, this.ProductID) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.IconUrl != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.IconUrl);
      i = paramInt;
      if (this.PackName != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.PackName);
      paramInt = i;
      if (this.PackDesc != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.PackDesc);
      i = paramInt;
      if (this.PackAuthInfo != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.PackAuthInfo);
      paramInt = i;
      if (this.PackPrice != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.PackPrice);
      i = paramInt + e.a.a.b.b.a.bs(7, this.PackType) + e.a.a.b.b.a.bs(8, this.PackFlag);
      paramInt = i;
      if (this.CoverUrl != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.CoverUrl);
      i = paramInt + e.a.a.b.b.a.bs(10, this.PackExpire);
      paramInt = i;
      if (this.PackCopyright != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.PackCopyright);
      i = paramInt + e.a.a.b.b.a.bs(12, this.Timestamp);
      paramInt = i;
      if (this.PanelUrl != null)
        paramInt = i + e.a.a.b.b.a.f(13, this.PanelUrl);
      i = paramInt;
      if (this.PriceNum != null)
        i = paramInt + e.a.a.b.b.a.f(14, this.PriceNum);
      paramInt = i;
      if (this.PriceType != null)
        paramInt = i + e.a.a.b.b.a.f(15, this.PriceType);
      i = paramInt;
      if (this.SendInfo != null)
        i = paramInt + e.a.a.b.b.a.f(16, this.SendInfo);
      paramInt = i;
      if (this.TimeLimitStr != null)
        paramInt = i + e.a.a.b.b.a.f(17, this.TimeLimitStr);
      i = paramInt;
      if (this.Introduce != null)
        i = paramInt + e.a.a.b.b.a.f(18, this.Introduce);
      paramInt = i;
      if (this.TagUri != null)
        paramInt = i + e.a.a.b.b.a.f(19, this.TagUri);
      i = paramInt;
      if (this.ExptDesc != null)
        i = paramInt + e.a.a.b.b.a.f(20, this.ExptDesc);
      AppMethodBeat.o(62545);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(62545);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        EmotionSummary localEmotionSummary = (EmotionSummary)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62545);
          break;
        case 1:
          localEmotionSummary.ProductID = locala.BTU.readString();
          AppMethodBeat.o(62545);
          paramInt = i;
          break;
        case 2:
          localEmotionSummary.IconUrl = locala.BTU.readString();
          AppMethodBeat.o(62545);
          paramInt = i;
          break;
        case 3:
          localEmotionSummary.PackName = locala.BTU.readString();
          AppMethodBeat.o(62545);
          paramInt = i;
          break;
        case 4:
          localEmotionSummary.PackDesc = locala.BTU.readString();
          AppMethodBeat.o(62545);
          paramInt = i;
          break;
        case 5:
          localEmotionSummary.PackAuthInfo = locala.BTU.readString();
          AppMethodBeat.o(62545);
          paramInt = i;
          break;
        case 6:
          localEmotionSummary.PackPrice = locala.BTU.readString();
          AppMethodBeat.o(62545);
          paramInt = i;
          break;
        case 7:
          localEmotionSummary.PackType = locala.BTU.vd();
          AppMethodBeat.o(62545);
          paramInt = i;
          break;
        case 8:
          localEmotionSummary.PackFlag = locala.BTU.vd();
          AppMethodBeat.o(62545);
          paramInt = i;
          break;
        case 9:
          localEmotionSummary.CoverUrl = locala.BTU.readString();
          AppMethodBeat.o(62545);
          paramInt = i;
          break;
        case 10:
          localEmotionSummary.PackExpire = locala.BTU.vd();
          AppMethodBeat.o(62545);
          paramInt = i;
          break;
        case 11:
          localEmotionSummary.PackCopyright = locala.BTU.readString();
          AppMethodBeat.o(62545);
          paramInt = i;
          break;
        case 12:
          localEmotionSummary.Timestamp = locala.BTU.vd();
          AppMethodBeat.o(62545);
          paramInt = i;
          break;
        case 13:
          localEmotionSummary.PanelUrl = locala.BTU.readString();
          AppMethodBeat.o(62545);
          paramInt = i;
          break;
        case 14:
          localEmotionSummary.PriceNum = locala.BTU.readString();
          AppMethodBeat.o(62545);
          paramInt = i;
          break;
        case 15:
          localEmotionSummary.PriceType = locala.BTU.readString();
          AppMethodBeat.o(62545);
          paramInt = i;
          break;
        case 16:
          localEmotionSummary.SendInfo = locala.BTU.readString();
          AppMethodBeat.o(62545);
          paramInt = i;
          break;
        case 17:
          localEmotionSummary.TimeLimitStr = locala.BTU.readString();
          AppMethodBeat.o(62545);
          paramInt = i;
          break;
        case 18:
          localEmotionSummary.Introduce = locala.BTU.readString();
          AppMethodBeat.o(62545);
          paramInt = i;
          break;
        case 19:
          localEmotionSummary.TagUri = locala.BTU.readString();
          AppMethodBeat.o(62545);
          paramInt = i;
          break;
        case 20:
          localEmotionSummary.ExptDesc = locala.BTU.readString();
          AppMethodBeat.o(62545);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(62545);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.EmotionSummary
 * JD-Core Version:    0.6.2
 */