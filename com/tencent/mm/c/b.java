package com.tencent.mm.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b extends com.tencent.mm.bt.a
{
  public String apkMd5;
  public int cdf;
  public String cdg;
  public int cdh;
  public String cdi;
  public String cdj;
  public boolean cdk;
  public int cdl;
  public boolean cdm;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(125684);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.apkMd5 == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: apkMd5");
        AppMethodBeat.o(125684);
        throw paramArrayOfObject;
      }
      if (this.apkMd5 != null)
        paramArrayOfObject.e(1, this.apkMd5);
      paramArrayOfObject.iA(2, this.cdf);
      if (this.cdg != null)
        paramArrayOfObject.e(3, this.cdg);
      paramArrayOfObject.iA(4, this.cdh);
      if (this.cdi != null)
        paramArrayOfObject.e(5, this.cdi);
      if (this.cdj != null)
        paramArrayOfObject.e(6, this.cdj);
      paramArrayOfObject.aO(7, this.cdk);
      paramArrayOfObject.iA(8, this.cdl);
      paramArrayOfObject.aO(9, this.cdm);
      AppMethodBeat.o(125684);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.apkMd5 == null)
        break label668;
    label668: for (paramInt = e.a.a.a.f(1, this.apkMd5) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.iw(2, this.cdf);
      paramInt = i;
      if (this.cdg != null)
        paramInt = i + e.a.a.a.f(3, this.cdg);
      i = paramInt + e.a.a.a.iw(4, this.cdh);
      paramInt = i;
      if (this.cdi != null)
        paramInt = i + e.a.a.a.f(5, this.cdi);
      i = paramInt;
      if (this.cdj != null)
        i = paramInt + e.a.a.a.f(6, this.cdj);
      paramInt = i + e.a.a.a.Vg(7) + e.a.a.a.iw(8, this.cdl) + e.a.a.a.Vg(9);
      AppMethodBeat.o(125684);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); ; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
        {
          if (paramInt <= 0)
          {
            if (this.apkMd5 != null)
              break;
            paramArrayOfObject = new e.a.a.b("Not all required fields were included: apkMd5");
            AppMethodBeat.o(125684);
            throw paramArrayOfObject;
          }
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        }
        AppMethodBeat.o(125684);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        b localb = (b)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(125684);
          break;
        case 1:
          localb.apkMd5 = locala.emq();
          AppMethodBeat.o(125684);
          paramInt = i;
          break;
        case 2:
          localb.cdf = locala.emp();
          AppMethodBeat.o(125684);
          paramInt = i;
          break;
        case 3:
          localb.cdg = locala.emq();
          AppMethodBeat.o(125684);
          paramInt = i;
          break;
        case 4:
          localb.cdh = locala.emp();
          AppMethodBeat.o(125684);
          paramInt = i;
          break;
        case 5:
          localb.cdi = locala.emq();
          AppMethodBeat.o(125684);
          paramInt = i;
          break;
        case 6:
          localb.cdj = locala.emq();
          AppMethodBeat.o(125684);
          paramInt = i;
          break;
        case 7:
          localb.cdk = locala.emr();
          AppMethodBeat.o(125684);
          paramInt = i;
          break;
        case 8:
          localb.cdl = locala.emp();
          AppMethodBeat.o(125684);
          paramInt = i;
          break;
        case 9:
          localb.cdm = locala.emr();
          AppMethodBeat.o(125684);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(125684);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.c.b
 * JD-Core Version:    0.6.2
 */