package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public class EmotionBanner extends com.tencent.mm.bt.a
{
  public EmotionBannerImg BannerImg;
  public EmotionSummary BannerSummary;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(62532);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BannerSummary == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BannerSummary");
        AppMethodBeat.o(62532);
        throw paramArrayOfObject;
      }
      if (this.BannerImg == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BannerImg");
        AppMethodBeat.o(62532);
        throw paramArrayOfObject;
      }
      if (this.BannerSummary != null)
      {
        paramArrayOfObject.iy(1, this.BannerSummary.computeSize());
        this.BannerSummary.writeFields(paramArrayOfObject);
      }
      if (this.BannerImg != null)
      {
        paramArrayOfObject.iy(2, this.BannerImg.computeSize());
        this.BannerImg.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(62532);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BannerSummary == null)
        break label579;
    label579: for (paramInt = e.a.a.a.ix(1, this.BannerSummary.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.BannerImg != null)
        i = paramInt + e.a.a.a.ix(2, this.BannerImg.computeSize());
      AppMethodBeat.o(62532);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BannerSummary == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BannerSummary");
          AppMethodBeat.o(62532);
          throw paramArrayOfObject;
        }
        if (this.BannerImg == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BannerImg");
          AppMethodBeat.o(62532);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(62532);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        EmotionBanner localEmotionBanner = (EmotionBanner)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(62532);
          paramInt = -1;
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new EmotionSummary();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localEmotionBanner.BannerSummary = paramArrayOfObject;
          }
          AppMethodBeat.o(62532);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new EmotionBannerImg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((EmotionBannerImg)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localEmotionBanner.BannerImg = ((EmotionBannerImg)localObject1);
          }
          AppMethodBeat.o(62532);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(62532);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.EmotionBanner
 * JD-Core Version:    0.6.2
 */