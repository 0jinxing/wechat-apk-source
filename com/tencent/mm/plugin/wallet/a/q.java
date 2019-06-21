package com.tencent.mm.plugin.wallet.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class q extends com.tencent.mm.bt.a
{
  public String desc;
  public String fjD;
  public String id;
  public String name;
  public int status;
  public String tmN;
  public String tnt;
  public String tnu;
  public String tnv = "0";
  public String tnw = "0";
  public int tnx = 0;
  public int tny;
  public String tnz;
  public int type;
  public String url;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56660);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.id != null)
        paramArrayOfObject.e(1, this.id);
      if (this.name != null)
        paramArrayOfObject.e(2, this.name);
      if (this.desc != null)
        paramArrayOfObject.e(3, this.desc);
      paramArrayOfObject.iz(4, this.status);
      if (this.url != null)
        paramArrayOfObject.e(5, this.url);
      paramArrayOfObject.iz(6, this.type);
      if (this.tnt != null)
        paramArrayOfObject.e(7, this.tnt);
      if (this.tnu != null)
        paramArrayOfObject.e(8, this.tnu);
      if (this.tnv != null)
        paramArrayOfObject.e(9, this.tnv);
      if (this.tnw != null)
        paramArrayOfObject.e(10, this.tnw);
      paramArrayOfObject.iz(11, this.tnx);
      if (this.tmN != null)
        paramArrayOfObject.e(12, this.tmN);
      if (this.fjD != null)
        paramArrayOfObject.e(13, this.fjD);
      paramArrayOfObject.iz(14, this.tny);
      if (this.tnz != null)
        paramArrayOfObject.e(15, this.tnz);
      AppMethodBeat.o(56660);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.id == null)
        break label1065;
    label1065: for (i = e.a.a.b.b.a.f(1, this.id) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.name != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.name);
      i = paramInt;
      if (this.desc != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.desc);
      i += e.a.a.b.b.a.bs(4, this.status);
      paramInt = i;
      if (this.url != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.url);
      paramInt += e.a.a.b.b.a.bs(6, this.type);
      i = paramInt;
      if (this.tnt != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.tnt);
      paramInt = i;
      if (this.tnu != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.tnu);
      i = paramInt;
      if (this.tnv != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.tnv);
      paramInt = i;
      if (this.tnw != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.tnw);
      i = paramInt + e.a.a.b.b.a.bs(11, this.tnx);
      paramInt = i;
      if (this.tmN != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.tmN);
      i = paramInt;
      if (this.fjD != null)
        i = paramInt + e.a.a.b.b.a.f(13, this.fjD);
      i += e.a.a.b.b.a.bs(14, this.tny);
      paramInt = i;
      if (this.tnz != null)
        paramInt = i + e.a.a.b.b.a.f(15, this.tnz);
      AppMethodBeat.o(56660);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56660);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        q localq = (q)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56660);
          break;
        case 1:
          localq.id = locala.BTU.readString();
          AppMethodBeat.o(56660);
          paramInt = i;
          break;
        case 2:
          localq.name = locala.BTU.readString();
          AppMethodBeat.o(56660);
          paramInt = i;
          break;
        case 3:
          localq.desc = locala.BTU.readString();
          AppMethodBeat.o(56660);
          paramInt = i;
          break;
        case 4:
          localq.status = locala.BTU.vd();
          AppMethodBeat.o(56660);
          paramInt = i;
          break;
        case 5:
          localq.url = locala.BTU.readString();
          AppMethodBeat.o(56660);
          paramInt = i;
          break;
        case 6:
          localq.type = locala.BTU.vd();
          AppMethodBeat.o(56660);
          paramInt = i;
          break;
        case 7:
          localq.tnt = locala.BTU.readString();
          AppMethodBeat.o(56660);
          paramInt = i;
          break;
        case 8:
          localq.tnu = locala.BTU.readString();
          AppMethodBeat.o(56660);
          paramInt = i;
          break;
        case 9:
          localq.tnv = locala.BTU.readString();
          AppMethodBeat.o(56660);
          paramInt = i;
          break;
        case 10:
          localq.tnw = locala.BTU.readString();
          AppMethodBeat.o(56660);
          paramInt = i;
          break;
        case 11:
          localq.tnx = locala.BTU.vd();
          AppMethodBeat.o(56660);
          paramInt = i;
          break;
        case 12:
          localq.tmN = locala.BTU.readString();
          AppMethodBeat.o(56660);
          paramInt = i;
          break;
        case 13:
          localq.fjD = locala.BTU.readString();
          AppMethodBeat.o(56660);
          paramInt = i;
          break;
        case 14:
          localq.tny = locala.BTU.vd();
          AppMethodBeat.o(56660);
          paramInt = i;
          break;
        case 15:
          localq.tnz = locala.BTU.readString();
          AppMethodBeat.o(56660);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56660);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.a.q
 * JD-Core Version:    0.6.2
 */