package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class bsl extends com.tencent.mm.bt.a
{
  public String AesKey;
  public String wTY;
  public String wUA;
  public String wUB;
  public String wUC;
  public String wUD;
  public float wUE;
  public String wUv;
  public float wUw;
  public String wUx;
  public String wUy;
  public String wUz;
  public String wdO;
  public String wip;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(65420);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wip == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: FileID");
        AppMethodBeat.o(65420);
        throw paramArrayOfObject;
      }
      if (this.AesKey == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AesKey");
        AppMethodBeat.o(65420);
        throw paramArrayOfObject;
      }
      if (this.wUx == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ThumbFileID");
        AppMethodBeat.o(65420);
        throw paramArrayOfObject;
      }
      if (this.wUy == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ThumbAesKey");
        AppMethodBeat.o(65420);
        throw paramArrayOfObject;
      }
      if (this.wUz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ThumbMD5");
        AppMethodBeat.o(65420);
        throw paramArrayOfObject;
      }
      if (this.wUB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: OriginThumbFileID");
        AppMethodBeat.o(65420);
        throw paramArrayOfObject;
      }
      if (this.wUC == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: OriginThumbAesKey");
        AppMethodBeat.o(65420);
        throw paramArrayOfObject;
      }
      if (this.wUD == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: OriginThumbMD5");
        AppMethodBeat.o(65420);
        throw paramArrayOfObject;
      }
      if (this.wip != null)
        paramArrayOfObject.e(1, this.wip);
      if (this.AesKey != null)
        paramArrayOfObject.e(2, this.AesKey);
      if (this.wdO != null)
        paramArrayOfObject.e(3, this.wdO);
      if (this.wUv != null)
        paramArrayOfObject.e(4, this.wUv);
      paramArrayOfObject.r(5, this.wUw);
      if (this.wUx != null)
        paramArrayOfObject.e(6, this.wUx);
      if (this.wUy != null)
        paramArrayOfObject.e(7, this.wUy);
      if (this.wUz != null)
        paramArrayOfObject.e(8, this.wUz);
      if (this.wTY != null)
        paramArrayOfObject.e(9, this.wTY);
      if (this.wUA != null)
        paramArrayOfObject.e(10, this.wUA);
      if (this.wUB != null)
        paramArrayOfObject.e(11, this.wUB);
      if (this.wUC != null)
        paramArrayOfObject.e(12, this.wUC);
      if (this.wUD != null)
        paramArrayOfObject.e(13, this.wUD);
      paramArrayOfObject.r(14, this.wUE);
      AppMethodBeat.o(65420);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wip == null)
        break label1424;
    label1424: for (paramInt = e.a.a.b.b.a.f(1, this.wip) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.AesKey != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.AesKey);
      paramInt = i;
      if (this.wdO != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wdO);
      i = paramInt;
      if (this.wUv != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wUv);
      i += e.a.a.b.b.a.fv(5) + 4;
      paramInt = i;
      if (this.wUx != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wUx);
      i = paramInt;
      if (this.wUy != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.wUy);
      paramInt = i;
      if (this.wUz != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wUz);
      int j = paramInt;
      if (this.wTY != null)
        j = paramInt + e.a.a.b.b.a.f(9, this.wTY);
      i = j;
      if (this.wUA != null)
        i = j + e.a.a.b.b.a.f(10, this.wUA);
      paramInt = i;
      if (this.wUB != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.wUB);
      i = paramInt;
      if (this.wUC != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.wUC);
      paramInt = i;
      if (this.wUD != null)
        paramInt = i + e.a.a.b.b.a.f(13, this.wUD);
      paramInt += e.a.a.b.b.a.fv(14) + 4;
      AppMethodBeat.o(65420);
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
          AppMethodBeat.o(65420);
          throw paramArrayOfObject;
        }
        if (this.AesKey == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AesKey");
          AppMethodBeat.o(65420);
          throw paramArrayOfObject;
        }
        if (this.wUx == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ThumbFileID");
          AppMethodBeat.o(65420);
          throw paramArrayOfObject;
        }
        if (this.wUy == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ThumbAesKey");
          AppMethodBeat.o(65420);
          throw paramArrayOfObject;
        }
        if (this.wUz == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ThumbMD5");
          AppMethodBeat.o(65420);
          throw paramArrayOfObject;
        }
        if (this.wUB == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: OriginThumbFileID");
          AppMethodBeat.o(65420);
          throw paramArrayOfObject;
        }
        if (this.wUC == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: OriginThumbAesKey");
          AppMethodBeat.o(65420);
          throw paramArrayOfObject;
        }
        if (this.wUD == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: OriginThumbMD5");
          AppMethodBeat.o(65420);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(65420);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bsl localbsl = (bsl)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(65420);
          break;
        case 1:
          localbsl.wip = locala.BTU.readString();
          AppMethodBeat.o(65420);
          paramInt = i;
          break;
        case 2:
          localbsl.AesKey = locala.BTU.readString();
          AppMethodBeat.o(65420);
          paramInt = i;
          break;
        case 3:
          localbsl.wdO = locala.BTU.readString();
          AppMethodBeat.o(65420);
          paramInt = i;
          break;
        case 4:
          localbsl.wUv = locala.BTU.readString();
          AppMethodBeat.o(65420);
          paramInt = i;
          break;
        case 5:
          localbsl.wUw = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(65420);
          paramInt = i;
          break;
        case 6:
          localbsl.wUx = locala.BTU.readString();
          AppMethodBeat.o(65420);
          paramInt = i;
          break;
        case 7:
          localbsl.wUy = locala.BTU.readString();
          AppMethodBeat.o(65420);
          paramInt = i;
          break;
        case 8:
          localbsl.wUz = locala.BTU.readString();
          AppMethodBeat.o(65420);
          paramInt = i;
          break;
        case 9:
          localbsl.wTY = locala.BTU.readString();
          AppMethodBeat.o(65420);
          paramInt = i;
          break;
        case 10:
          localbsl.wUA = locala.BTU.readString();
          AppMethodBeat.o(65420);
          paramInt = i;
          break;
        case 11:
          localbsl.wUB = locala.BTU.readString();
          AppMethodBeat.o(65420);
          paramInt = i;
          break;
        case 12:
          localbsl.wUC = locala.BTU.readString();
          AppMethodBeat.o(65420);
          paramInt = i;
          break;
        case 13:
          localbsl.wUD = locala.BTU.readString();
          AppMethodBeat.o(65420);
          paramInt = i;
          break;
        case 14:
          localbsl.wUE = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(65420);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(65420);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bsl
 * JD-Core Version:    0.6.2
 */