package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public class EmotionBannerSet extends com.tencent.mm.bt.a
{
  public EmotionBannerImg BannerImg;
  public String Desc;
  public int ID;
  public String IconUrl;
  public String LocateUrl;
  public String ProductID;
  public String SecondUrl;
  public int SetType;
  public String TagUrl;
  public String Title;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(62534);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BannerImg == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BannerImg");
        AppMethodBeat.o(62534);
        throw paramArrayOfObject;
      }
      if (this.BannerImg != null)
      {
        paramArrayOfObject.iy(1, this.BannerImg.computeSize());
        this.BannerImg.writeFields(paramArrayOfObject);
      }
      if (this.Title != null)
        paramArrayOfObject.e(2, this.Title);
      if (this.LocateUrl != null)
        paramArrayOfObject.e(3, this.LocateUrl);
      paramArrayOfObject.iz(4, this.ID);
      if (this.SecondUrl != null)
        paramArrayOfObject.e(5, this.SecondUrl);
      paramArrayOfObject.iz(6, this.SetType);
      if (this.IconUrl != null)
        paramArrayOfObject.e(7, this.IconUrl);
      if (this.Desc != null)
        paramArrayOfObject.e(8, this.Desc);
      if (this.ProductID != null)
        paramArrayOfObject.e(9, this.ProductID);
      if (this.TagUrl != null)
        paramArrayOfObject.e(10, this.TagUrl);
      AppMethodBeat.o(62534);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BannerImg == null)
        break label918;
    label918: for (i = e.a.a.a.ix(1, this.BannerImg.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.Title != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.Title);
      i = paramInt;
      if (this.LocateUrl != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.LocateUrl);
      i += e.a.a.b.b.a.bs(4, this.ID);
      paramInt = i;
      if (this.SecondUrl != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.SecondUrl);
      i = paramInt + e.a.a.b.b.a.bs(6, this.SetType);
      paramInt = i;
      if (this.IconUrl != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.IconUrl);
      i = paramInt;
      if (this.Desc != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.Desc);
      paramInt = i;
      if (this.ProductID != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.ProductID);
      i = paramInt;
      if (this.TagUrl != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.TagUrl);
      AppMethodBeat.o(62534);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BannerImg == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BannerImg");
          AppMethodBeat.o(62534);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(62534);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        EmotionBannerSet localEmotionBannerSet = (EmotionBannerSet)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62534);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new EmotionBannerImg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localEmotionBannerSet.BannerImg = paramArrayOfObject;
          }
          AppMethodBeat.o(62534);
          paramInt = i;
          break;
        case 2:
          localEmotionBannerSet.Title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62534);
          paramInt = i;
          break;
        case 3:
          localEmotionBannerSet.LocateUrl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62534);
          paramInt = i;
          break;
        case 4:
          localEmotionBannerSet.ID = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62534);
          paramInt = i;
          break;
        case 5:
          localEmotionBannerSet.SecondUrl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62534);
          paramInt = i;
          break;
        case 6:
          localEmotionBannerSet.SetType = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62534);
          paramInt = i;
          break;
        case 7:
          localEmotionBannerSet.IconUrl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62534);
          paramInt = i;
          break;
        case 8:
          localEmotionBannerSet.Desc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62534);
          paramInt = i;
          break;
        case 9:
          localEmotionBannerSet.ProductID = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62534);
          paramInt = i;
          break;
        case 10:
          localEmotionBannerSet.TagUrl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62534);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(62534);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.EmotionBannerSet
 * JD-Core Version:    0.6.2
 */