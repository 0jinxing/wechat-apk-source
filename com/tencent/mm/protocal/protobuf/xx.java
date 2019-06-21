package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class xx extends com.tencent.mm.bt.a
{
  public String ActivityID;
  public String AesKey;
  public String EncryptUrl;
  public String ExternMd5;
  public String ExternUrl;
  public String Md5;
  public String ProductID;
  public String ThumbUrl;
  public String Url;
  public String wdC;
  public String wdD;
  public String wdE;
  public String wdF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(62523);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Md5 == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Md5");
        AppMethodBeat.o(62523);
        throw paramArrayOfObject;
      }
      if (this.Md5 != null)
        paramArrayOfObject.e(1, this.Md5);
      if (this.Url != null)
        paramArrayOfObject.e(2, this.Url);
      if (this.ThumbUrl != null)
        paramArrayOfObject.e(3, this.ThumbUrl);
      if (this.wdC != null)
        paramArrayOfObject.e(4, this.wdC);
      if (this.EncryptUrl != null)
        paramArrayOfObject.e(5, this.EncryptUrl);
      if (this.AesKey != null)
        paramArrayOfObject.e(6, this.AesKey);
      if (this.ProductID != null)
        paramArrayOfObject.e(7, this.ProductID);
      if (this.ExternUrl != null)
        paramArrayOfObject.e(8, this.ExternUrl);
      if (this.ExternMd5 != null)
        paramArrayOfObject.e(9, this.ExternMd5);
      if (this.ActivityID != null)
        paramArrayOfObject.e(10, this.ActivityID);
      if (this.wdD != null)
        paramArrayOfObject.e(11, this.wdD);
      if (this.wdE != null)
        paramArrayOfObject.e(12, this.wdE);
      if (this.wdF != null)
        paramArrayOfObject.e(13, this.wdF);
      AppMethodBeat.o(62523);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Md5 == null)
        break label1051;
    label1051: for (i = e.a.a.b.b.a.f(1, this.Md5) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.Url != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.Url);
      i = paramInt;
      if (this.ThumbUrl != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.ThumbUrl);
      paramInt = i;
      if (this.wdC != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wdC);
      i = paramInt;
      if (this.EncryptUrl != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.EncryptUrl);
      paramInt = i;
      if (this.AesKey != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.AesKey);
      i = paramInt;
      if (this.ProductID != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.ProductID);
      paramInt = i;
      if (this.ExternUrl != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.ExternUrl);
      i = paramInt;
      if (this.ExternMd5 != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.ExternMd5);
      paramInt = i;
      if (this.ActivityID != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.ActivityID);
      i = paramInt;
      if (this.wdD != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.wdD);
      paramInt = i;
      if (this.wdE != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.wdE);
      i = paramInt;
      if (this.wdF != null)
        i = paramInt + e.a.a.b.b.a.f(13, this.wdF);
      AppMethodBeat.o(62523);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.Md5 == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Md5");
          AppMethodBeat.o(62523);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(62523);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        xx localxx = (xx)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62523);
          break;
        case 1:
          localxx.Md5 = locala.BTU.readString();
          AppMethodBeat.o(62523);
          paramInt = i;
          break;
        case 2:
          localxx.Url = locala.BTU.readString();
          AppMethodBeat.o(62523);
          paramInt = i;
          break;
        case 3:
          localxx.ThumbUrl = locala.BTU.readString();
          AppMethodBeat.o(62523);
          paramInt = i;
          break;
        case 4:
          localxx.wdC = locala.BTU.readString();
          AppMethodBeat.o(62523);
          paramInt = i;
          break;
        case 5:
          localxx.EncryptUrl = locala.BTU.readString();
          AppMethodBeat.o(62523);
          paramInt = i;
          break;
        case 6:
          localxx.AesKey = locala.BTU.readString();
          AppMethodBeat.o(62523);
          paramInt = i;
          break;
        case 7:
          localxx.ProductID = locala.BTU.readString();
          AppMethodBeat.o(62523);
          paramInt = i;
          break;
        case 8:
          localxx.ExternUrl = locala.BTU.readString();
          AppMethodBeat.o(62523);
          paramInt = i;
          break;
        case 9:
          localxx.ExternMd5 = locala.BTU.readString();
          AppMethodBeat.o(62523);
          paramInt = i;
          break;
        case 10:
          localxx.ActivityID = locala.BTU.readString();
          AppMethodBeat.o(62523);
          paramInt = i;
          break;
        case 11:
          localxx.wdD = locala.BTU.readString();
          AppMethodBeat.o(62523);
          paramInt = i;
          break;
        case 12:
          localxx.wdE = locala.BTU.readString();
          AppMethodBeat.o(62523);
          paramInt = i;
          break;
        case 13:
          localxx.wdF = locala.BTU.readString();
          AppMethodBeat.o(62523);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(62523);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.xx
 * JD-Core Version:    0.6.2
 */