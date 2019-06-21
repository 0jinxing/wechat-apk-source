package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class crt extends com.tencent.mm.bt.a
{
  public String ProductID;
  public String Title;
  public String wOs;
  public int xpo;
  public String xpp;
  public String xpq;
  public String xpr;
  public String xps;
  public String xpt;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28705);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Title != null)
        paramArrayOfObject.e(1, this.Title);
      if (this.ProductID != null)
        paramArrayOfObject.e(2, this.ProductID);
      paramArrayOfObject.iz(3, this.xpo);
      if (this.xpp != null)
        paramArrayOfObject.e(4, this.xpp);
      if (this.wOs != null)
        paramArrayOfObject.e(5, this.wOs);
      if (this.xpq != null)
        paramArrayOfObject.e(6, this.xpq);
      if (this.xpr != null)
        paramArrayOfObject.e(7, this.xpr);
      if (this.xps != null)
        paramArrayOfObject.e(8, this.xps);
      if (this.xpt != null)
        paramArrayOfObject.e(9, this.xpt);
      AppMethodBeat.o(28705);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Title == null)
        break label742;
    label742: for (paramInt = e.a.a.b.b.a.f(1, this.Title) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.ProductID != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.ProductID);
      i += e.a.a.b.b.a.bs(3, this.xpo);
      paramInt = i;
      if (this.xpp != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.xpp);
      i = paramInt;
      if (this.wOs != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wOs);
      paramInt = i;
      if (this.xpq != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.xpq);
      i = paramInt;
      if (this.xpr != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.xpr);
      paramInt = i;
      if (this.xps != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.xps);
      i = paramInt;
      if (this.xpt != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.xpt);
      AppMethodBeat.o(28705);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28705);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        crt localcrt = (crt)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28705);
          break;
        case 1:
          localcrt.Title = locala.BTU.readString();
          AppMethodBeat.o(28705);
          paramInt = i;
          break;
        case 2:
          localcrt.ProductID = locala.BTU.readString();
          AppMethodBeat.o(28705);
          paramInt = i;
          break;
        case 3:
          localcrt.xpo = locala.BTU.vd();
          AppMethodBeat.o(28705);
          paramInt = i;
          break;
        case 4:
          localcrt.xpp = locala.BTU.readString();
          AppMethodBeat.o(28705);
          paramInt = i;
          break;
        case 5:
          localcrt.wOs = locala.BTU.readString();
          AppMethodBeat.o(28705);
          paramInt = i;
          break;
        case 6:
          localcrt.xpq = locala.BTU.readString();
          AppMethodBeat.o(28705);
          paramInt = i;
          break;
        case 7:
          localcrt.xpr = locala.BTU.readString();
          AppMethodBeat.o(28705);
          paramInt = i;
          break;
        case 8:
          localcrt.xps = locala.BTU.readString();
          AppMethodBeat.o(28705);
          paramInt = i;
          break;
        case 9:
          localcrt.xpt = locala.BTU.readString();
          AppMethodBeat.o(28705);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28705);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.crt
 * JD-Core Version:    0.6.2
 */