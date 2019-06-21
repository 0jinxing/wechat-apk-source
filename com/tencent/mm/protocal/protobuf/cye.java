package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public class cye extends com.tencent.mm.bt.a
{
  public String IconUrl;
  public String fKh;
  public String jBB;
  public String nay;
  public String ncH;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(93819);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.fKh == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AppId");
        AppMethodBeat.o(93819);
        throw paramArrayOfObject;
      }
      if (this.ncH == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AppName");
        AppMethodBeat.o(93819);
        throw paramArrayOfObject;
      }
      if (this.jBB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: UserName");
        AppMethodBeat.o(93819);
        throw paramArrayOfObject;
      }
      if (this.IconUrl == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: IconUrl");
        AppMethodBeat.o(93819);
        throw paramArrayOfObject;
      }
      if (this.fKh != null)
        paramArrayOfObject.e(1, this.fKh);
      if (this.ncH != null)
        paramArrayOfObject.e(2, this.ncH);
      if (this.jBB != null)
        paramArrayOfObject.e(3, this.jBB);
      if (this.IconUrl != null)
        paramArrayOfObject.e(4, this.IconUrl);
      if (this.nay != null)
        paramArrayOfObject.e(5, this.nay);
      AppMethodBeat.o(93819);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.fKh == null)
        break label675;
    label675: for (i = e.a.a.b.b.a.f(1, this.fKh) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.ncH != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.ncH);
      i = paramInt;
      if (this.jBB != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.jBB);
      paramInt = i;
      if (this.IconUrl != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.IconUrl);
      i = paramInt;
      if (this.nay != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.nay);
      AppMethodBeat.o(93819);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.fKh == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AppId");
          AppMethodBeat.o(93819);
          throw paramArrayOfObject;
        }
        if (this.ncH == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AppName");
          AppMethodBeat.o(93819);
          throw paramArrayOfObject;
        }
        if (this.jBB == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: UserName");
          AppMethodBeat.o(93819);
          throw paramArrayOfObject;
        }
        if (this.IconUrl == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: IconUrl");
          AppMethodBeat.o(93819);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(93819);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cye localcye = (cye)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(93819);
          break;
        case 1:
          localcye.fKh = locala.BTU.readString();
          AppMethodBeat.o(93819);
          paramInt = i;
          break;
        case 2:
          localcye.ncH = locala.BTU.readString();
          AppMethodBeat.o(93819);
          paramInt = i;
          break;
        case 3:
          localcye.jBB = locala.BTU.readString();
          AppMethodBeat.o(93819);
          paramInt = i;
          break;
        case 4:
          localcye.IconUrl = locala.BTU.readString();
          AppMethodBeat.o(93819);
          paramInt = i;
          break;
        case 5:
          localcye.nay = locala.BTU.readString();
          AppMethodBeat.o(93819);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(93819);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cye
 * JD-Core Version:    0.6.2
 */