package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class che extends com.tencent.mm.bt.a
{
  public String bzH;
  public String cdy;
  public int iCm;
  public String nna;
  public String nuk;
  public String num;
  public String nun;
  public String nuo;
  public String title;
  public int versionCode;
  public String xga;
  public String xgb;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(105579);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.num == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: patchId");
        AppMethodBeat.o(105579);
        throw paramArrayOfObject;
      }
      if (this.nun == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: newApkMd5");
        AppMethodBeat.o(105579);
        throw paramArrayOfObject;
      }
      if (this.nuo == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: oldApkMd5");
        AppMethodBeat.o(105579);
        throw paramArrayOfObject;
      }
      if (this.title == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: title");
        AppMethodBeat.o(105579);
        throw paramArrayOfObject;
      }
      if (this.xgb == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: okBtn");
        AppMethodBeat.o(105579);
        throw paramArrayOfObject;
      }
      if (this.nna == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: cancelBtn");
        AppMethodBeat.o(105579);
        throw paramArrayOfObject;
      }
      if (this.cdy == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: patchMd5");
        AppMethodBeat.o(105579);
        throw paramArrayOfObject;
      }
      if (this.num != null)
        paramArrayOfObject.e(1, this.num);
      if (this.xga != null)
        paramArrayOfObject.e(2, this.xga);
      paramArrayOfObject.iz(3, this.iCm);
      if (this.nun != null)
        paramArrayOfObject.e(4, this.nun);
      if (this.nuo != null)
        paramArrayOfObject.e(5, this.nuo);
      if (this.title != null)
        paramArrayOfObject.e(6, this.title);
      if (this.bzH != null)
        paramArrayOfObject.e(7, this.bzH);
      if (this.xgb != null)
        paramArrayOfObject.e(8, this.xgb);
      if (this.nna != null)
        paramArrayOfObject.e(9, this.nna);
      if (this.nuk != null)
        paramArrayOfObject.e(10, this.nuk);
      if (this.cdy != null)
        paramArrayOfObject.e(11, this.cdy);
      paramArrayOfObject.iz(12, this.versionCode);
      AppMethodBeat.o(105579);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.num == null)
        break label1240;
    label1240: for (paramInt = e.a.a.b.b.a.f(1, this.num) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.xga != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.xga);
      i += e.a.a.b.b.a.bs(3, this.iCm);
      paramInt = i;
      if (this.nun != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.nun);
      i = paramInt;
      if (this.nuo != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.nuo);
      paramInt = i;
      if (this.title != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.title);
      i = paramInt;
      if (this.bzH != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.bzH);
      paramInt = i;
      if (this.xgb != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.xgb);
      i = paramInt;
      if (this.nna != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.nna);
      paramInt = i;
      if (this.nuk != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.nuk);
      i = paramInt;
      if (this.cdy != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.cdy);
      paramInt = i + e.a.a.b.b.a.bs(12, this.versionCode);
      AppMethodBeat.o(105579);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.num == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: patchId");
          AppMethodBeat.o(105579);
          throw paramArrayOfObject;
        }
        if (this.nun == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: newApkMd5");
          AppMethodBeat.o(105579);
          throw paramArrayOfObject;
        }
        if (this.nuo == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: oldApkMd5");
          AppMethodBeat.o(105579);
          throw paramArrayOfObject;
        }
        if (this.title == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: title");
          AppMethodBeat.o(105579);
          throw paramArrayOfObject;
        }
        if (this.xgb == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: okBtn");
          AppMethodBeat.o(105579);
          throw paramArrayOfObject;
        }
        if (this.nna == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: cancelBtn");
          AppMethodBeat.o(105579);
          throw paramArrayOfObject;
        }
        if (this.cdy == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: patchMd5");
          AppMethodBeat.o(105579);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(105579);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        che localche = (che)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(105579);
          break;
        case 1:
          localche.num = locala.BTU.readString();
          AppMethodBeat.o(105579);
          paramInt = i;
          break;
        case 2:
          localche.xga = locala.BTU.readString();
          AppMethodBeat.o(105579);
          paramInt = i;
          break;
        case 3:
          localche.iCm = locala.BTU.vd();
          AppMethodBeat.o(105579);
          paramInt = i;
          break;
        case 4:
          localche.nun = locala.BTU.readString();
          AppMethodBeat.o(105579);
          paramInt = i;
          break;
        case 5:
          localche.nuo = locala.BTU.readString();
          AppMethodBeat.o(105579);
          paramInt = i;
          break;
        case 6:
          localche.title = locala.BTU.readString();
          AppMethodBeat.o(105579);
          paramInt = i;
          break;
        case 7:
          localche.bzH = locala.BTU.readString();
          AppMethodBeat.o(105579);
          paramInt = i;
          break;
        case 8:
          localche.xgb = locala.BTU.readString();
          AppMethodBeat.o(105579);
          paramInt = i;
          break;
        case 9:
          localche.nna = locala.BTU.readString();
          AppMethodBeat.o(105579);
          paramInt = i;
          break;
        case 10:
          localche.nuk = locala.BTU.readString();
          AppMethodBeat.o(105579);
          paramInt = i;
          break;
        case 11:
          localche.cdy = locala.BTU.readString();
          AppMethodBeat.o(105579);
          paramInt = i;
          break;
        case 12:
          localche.versionCode = locala.BTU.vd();
          AppMethodBeat.o(105579);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(105579);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.che
 * JD-Core Version:    0.6.2
 */