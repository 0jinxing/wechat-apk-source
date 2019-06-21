package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class EmotionCDNUrl extends com.tencent.mm.bt.a
{
  public String AesKey;
  public int FileSize;
  public String Url;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(62535);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Url != null)
        paramArrayOfObject.e(1, this.Url);
      if (this.AesKey != null)
        paramArrayOfObject.e(2, this.AesKey);
      paramArrayOfObject.iz(3, this.FileSize);
      AppMethodBeat.o(62535);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Url == null)
        break label337;
    label337: for (paramInt = e.a.a.b.b.a.f(1, this.Url) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.AesKey != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.AesKey);
      paramInt = i + e.a.a.b.b.a.bs(3, this.FileSize);
      AppMethodBeat.o(62535);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(62535);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        EmotionCDNUrl localEmotionCDNUrl = (EmotionCDNUrl)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62535);
          break;
        case 1:
          localEmotionCDNUrl.Url = locala.BTU.readString();
          AppMethodBeat.o(62535);
          paramInt = i;
          break;
        case 2:
          localEmotionCDNUrl.AesKey = locala.BTU.readString();
          AppMethodBeat.o(62535);
          paramInt = i;
          break;
        case 3:
          localEmotionCDNUrl.FileSize = locala.BTU.vd();
          AppMethodBeat.o(62535);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(62535);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.EmotionCDNUrl
 * JD-Core Version:    0.6.2
 */