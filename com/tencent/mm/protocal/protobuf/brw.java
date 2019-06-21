package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class brw extends com.tencent.mm.bt.a
{
  public String AesKey;
  public String wTW;
  public String wTX;
  public String wTY;
  public String wdO;
  public String wip;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(65416);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wip == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: FileID");
        AppMethodBeat.o(65416);
        throw paramArrayOfObject;
      }
      if (this.AesKey == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AesKey");
        AppMethodBeat.o(65416);
        throw paramArrayOfObject;
      }
      if (this.wdO == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: MD5");
        AppMethodBeat.o(65416);
        throw paramArrayOfObject;
      }
      if (this.wTW == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: OriginFileID");
        AppMethodBeat.o(65416);
        throw paramArrayOfObject;
      }
      if (this.wTX == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: OriginAesKey");
        AppMethodBeat.o(65416);
        throw paramArrayOfObject;
      }
      if (this.wTY == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: OriginMD5");
        AppMethodBeat.o(65416);
        throw paramArrayOfObject;
      }
      if (this.wip != null)
        paramArrayOfObject.e(1, this.wip);
      if (this.AesKey != null)
        paramArrayOfObject.e(2, this.AesKey);
      if (this.wdO != null)
        paramArrayOfObject.e(3, this.wdO);
      if (this.wTW != null)
        paramArrayOfObject.e(4, this.wTW);
      if (this.wTX != null)
        paramArrayOfObject.e(5, this.wTX);
      if (this.wTY != null)
        paramArrayOfObject.e(6, this.wTY);
      AppMethodBeat.o(65416);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wip == null)
        break label834;
    label834: for (i = e.a.a.b.b.a.f(1, this.wip) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.AesKey != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.AesKey);
      i = paramInt;
      if (this.wdO != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wdO);
      paramInt = i;
      if (this.wTW != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wTW);
      i = paramInt;
      if (this.wTX != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wTX);
      paramInt = i;
      if (this.wTY != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wTY);
      AppMethodBeat.o(65416);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wip == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: FileID");
          AppMethodBeat.o(65416);
          throw paramArrayOfObject;
        }
        if (this.AesKey == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AesKey");
          AppMethodBeat.o(65416);
          throw paramArrayOfObject;
        }
        if (this.wdO == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: MD5");
          AppMethodBeat.o(65416);
          throw paramArrayOfObject;
        }
        if (this.wTW == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: OriginFileID");
          AppMethodBeat.o(65416);
          throw paramArrayOfObject;
        }
        if (this.wTX == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: OriginAesKey");
          AppMethodBeat.o(65416);
          throw paramArrayOfObject;
        }
        if (this.wTY == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: OriginMD5");
          AppMethodBeat.o(65416);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(65416);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        brw localbrw = (brw)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(65416);
          break;
        case 1:
          localbrw.wip = locala.BTU.readString();
          AppMethodBeat.o(65416);
          paramInt = i;
          break;
        case 2:
          localbrw.AesKey = locala.BTU.readString();
          AppMethodBeat.o(65416);
          paramInt = i;
          break;
        case 3:
          localbrw.wdO = locala.BTU.readString();
          AppMethodBeat.o(65416);
          paramInt = i;
          break;
        case 4:
          localbrw.wTW = locala.BTU.readString();
          AppMethodBeat.o(65416);
          paramInt = i;
          break;
        case 5:
          localbrw.wTX = locala.BTU.readString();
          AppMethodBeat.o(65416);
          paramInt = i;
          break;
        case 6:
          localbrw.wTY = locala.BTU.readString();
          AppMethodBeat.o(65416);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(65416);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.brw
 * JD-Core Version:    0.6.2
 */