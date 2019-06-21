package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class PackThumbExt extends com.tencent.mm.bt.a
{
  public String ActivityID;
  public String AesKey;
  public String CDNUrl;
  public String Desc;
  public String EncryptUrl;
  public String ExternMd5;
  public String ExternUrl;
  public String Md5;
  public String PreviewUrl;
  public String ThumbUrl;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(62577);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.PreviewUrl != null)
        paramArrayOfObject.e(1, this.PreviewUrl);
      if (this.Desc != null)
        paramArrayOfObject.e(2, this.Desc);
      if (this.Md5 != null)
        paramArrayOfObject.e(3, this.Md5);
      if (this.AesKey != null)
        paramArrayOfObject.e(4, this.AesKey);
      if (this.CDNUrl != null)
        paramArrayOfObject.e(5, this.CDNUrl);
      if (this.ThumbUrl != null)
        paramArrayOfObject.e(6, this.ThumbUrl);
      if (this.EncryptUrl != null)
        paramArrayOfObject.e(7, this.EncryptUrl);
      if (this.ExternUrl != null)
        paramArrayOfObject.e(8, this.ExternUrl);
      if (this.ExternMd5 != null)
        paramArrayOfObject.e(9, this.ExternMd5);
      if (this.ActivityID != null)
        paramArrayOfObject.e(10, this.ActivityID);
      AppMethodBeat.o(62577);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.PreviewUrl == null)
        break label810;
    label810: for (i = e.a.a.b.b.a.f(1, this.PreviewUrl) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.Desc != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.Desc);
      i = paramInt;
      if (this.Md5 != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.Md5);
      int j = i;
      if (this.AesKey != null)
        j = i + e.a.a.b.b.a.f(4, this.AesKey);
      paramInt = j;
      if (this.CDNUrl != null)
        paramInt = j + e.a.a.b.b.a.f(5, this.CDNUrl);
      i = paramInt;
      if (this.ThumbUrl != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.ThumbUrl);
      paramInt = i;
      if (this.EncryptUrl != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.EncryptUrl);
      i = paramInt;
      if (this.ExternUrl != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.ExternUrl);
      paramInt = i;
      if (this.ExternMd5 != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.ExternMd5);
      i = paramInt;
      if (this.ActivityID != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.ActivityID);
      AppMethodBeat.o(62577);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(62577);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        PackThumbExt localPackThumbExt = (PackThumbExt)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62577);
          break;
        case 1:
          localPackThumbExt.PreviewUrl = locala.BTU.readString();
          AppMethodBeat.o(62577);
          paramInt = i;
          break;
        case 2:
          localPackThumbExt.Desc = locala.BTU.readString();
          AppMethodBeat.o(62577);
          paramInt = i;
          break;
        case 3:
          localPackThumbExt.Md5 = locala.BTU.readString();
          AppMethodBeat.o(62577);
          paramInt = i;
          break;
        case 4:
          localPackThumbExt.AesKey = locala.BTU.readString();
          AppMethodBeat.o(62577);
          paramInt = i;
          break;
        case 5:
          localPackThumbExt.CDNUrl = locala.BTU.readString();
          AppMethodBeat.o(62577);
          paramInt = i;
          break;
        case 6:
          localPackThumbExt.ThumbUrl = locala.BTU.readString();
          AppMethodBeat.o(62577);
          paramInt = i;
          break;
        case 7:
          localPackThumbExt.EncryptUrl = locala.BTU.readString();
          AppMethodBeat.o(62577);
          paramInt = i;
          break;
        case 8:
          localPackThumbExt.ExternUrl = locala.BTU.readString();
          AppMethodBeat.o(62577);
          paramInt = i;
          break;
        case 9:
          localPackThumbExt.ExternMd5 = locala.BTU.readString();
          AppMethodBeat.o(62577);
          paramInt = i;
          break;
        case 10:
          localPackThumbExt.ActivityID = locala.BTU.readString();
          AppMethodBeat.o(62577);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(62577);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.PackThumbExt
 * JD-Core Version:    0.6.2
 */