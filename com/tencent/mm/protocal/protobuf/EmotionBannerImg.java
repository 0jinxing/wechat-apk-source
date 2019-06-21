package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class EmotionBannerImg extends com.tencent.mm.bt.a
{
  public int Height;
  public String ImgUrl;
  public String StripUrl;
  public int Width;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(62533);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ImgUrl != null)
        paramArrayOfObject.e(1, this.ImgUrl);
      paramArrayOfObject.iz(2, this.Width);
      paramArrayOfObject.iz(3, this.Height);
      if (this.StripUrl != null)
        paramArrayOfObject.e(4, this.StripUrl);
      AppMethodBeat.o(62533);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ImgUrl == null)
        break label384;
    label384: for (paramInt = e.a.a.b.b.a.f(1, this.ImgUrl) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.Width) + e.a.a.b.b.a.bs(3, this.Height);
      paramInt = i;
      if (this.StripUrl != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.StripUrl);
      AppMethodBeat.o(62533);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(62533);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        EmotionBannerImg localEmotionBannerImg = (EmotionBannerImg)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62533);
          break;
        case 1:
          localEmotionBannerImg.ImgUrl = locala.BTU.readString();
          AppMethodBeat.o(62533);
          paramInt = i;
          break;
        case 2:
          localEmotionBannerImg.Width = locala.BTU.vd();
          AppMethodBeat.o(62533);
          paramInt = i;
          break;
        case 3:
          localEmotionBannerImg.Height = locala.BTU.vd();
          AppMethodBeat.o(62533);
          paramInt = i;
          break;
        case 4:
          localEmotionBannerImg.StripUrl = locala.BTU.readString();
          AppMethodBeat.o(62533);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(62533);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.EmotionBannerImg
 * JD-Core Version:    0.6.2
 */