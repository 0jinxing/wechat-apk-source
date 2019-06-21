package com.tencent.mm.plugin.wallet.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class t extends com.tencent.mm.bt.a
{
  public String pcj;
  public String tmO;
  public String tmP;
  public String tmQ;
  public int tnJ;
  public int tnK;
  public long tnL;
  public String tnM;
  public String tnN;
  public String tnO;
  public double tnP;
  public double tnQ;
  public int tnR;
  public String tnS;
  public String tnT;
  public LinkedList<b> tnU;

  public t()
  {
    AppMethodBeat.i(56661);
    this.tnU = new LinkedList();
    AppMethodBeat.o(56661);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56662);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.tnJ);
      paramArrayOfObject.iz(2, this.tnK);
      paramArrayOfObject.ai(3, this.tnL);
      if (this.tnM != null)
        paramArrayOfObject.e(4, this.tnM);
      if (this.tmO != null)
        paramArrayOfObject.e(5, this.tmO);
      if (this.tnN != null)
        paramArrayOfObject.e(6, this.tnN);
      if (this.tnO != null)
        paramArrayOfObject.e(7, this.tnO);
      if (this.tmP != null)
        paramArrayOfObject.e(8, this.tmP);
      if (this.tmQ != null)
        paramArrayOfObject.e(9, this.tmQ);
      paramArrayOfObject.f(10, this.tnP);
      paramArrayOfObject.f(11, this.tnQ);
      paramArrayOfObject.iz(12, this.tnR);
      if (this.tnS != null)
        paramArrayOfObject.e(13, this.tnS);
      if (this.pcj != null)
        paramArrayOfObject.e(14, this.pcj);
      if (this.tnT != null)
        paramArrayOfObject.e(16, this.tnT);
      paramArrayOfObject.e(17, 6, this.tnU);
      AppMethodBeat.o(56662);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.tnJ) + 0 + e.a.a.b.b.a.bs(2, this.tnK) + e.a.a.b.b.a.o(3, this.tnL);
        int i = paramInt;
        if (this.tnM != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.tnM);
        paramInt = i;
        if (this.tmO != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.tmO);
        int j = paramInt;
        if (this.tnN != null)
          j = paramInt + e.a.a.b.b.a.f(6, this.tnN);
        i = j;
        if (this.tnO != null)
          i = j + e.a.a.b.b.a.f(7, this.tnO);
        paramInt = i;
        if (this.tmP != null)
          paramInt = i + e.a.a.b.b.a.f(8, this.tmP);
        i = paramInt;
        if (this.tmQ != null)
          i = paramInt + e.a.a.b.b.a.f(9, this.tmQ);
        paramInt = i + (e.a.a.b.b.a.fv(10) + 8) + (e.a.a.b.b.a.fv(11) + 8) + e.a.a.b.b.a.bs(12, this.tnR);
        i = paramInt;
        if (this.tnS != null)
          i = paramInt + e.a.a.b.b.a.f(13, this.tnS);
        paramInt = i;
        if (this.pcj != null)
          paramInt = i + e.a.a.b.b.a.f(14, this.pcj);
        i = paramInt;
        if (this.tnT != null)
          i = paramInt + e.a.a.b.b.a.f(16, this.tnT);
        paramInt = i + e.a.a.a.c(17, 6, this.tnU);
        AppMethodBeat.o(56662);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.tnU.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56662);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        t localt = (t)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        case 15:
        default:
          paramInt = -1;
          AppMethodBeat.o(56662);
          break;
        case 1:
          localt.tnJ = locala.BTU.vd();
          AppMethodBeat.o(56662);
          paramInt = 0;
          break;
        case 2:
          localt.tnK = locala.BTU.vd();
          AppMethodBeat.o(56662);
          paramInt = 0;
          break;
        case 3:
          localt.tnL = locala.BTU.ve();
          AppMethodBeat.o(56662);
          paramInt = 0;
          break;
        case 4:
          localt.tnM = locala.BTU.readString();
          AppMethodBeat.o(56662);
          paramInt = 0;
          break;
        case 5:
          localt.tmO = locala.BTU.readString();
          AppMethodBeat.o(56662);
          paramInt = 0;
          break;
        case 6:
          localt.tnN = locala.BTU.readString();
          AppMethodBeat.o(56662);
          paramInt = 0;
          break;
        case 7:
          localt.tnO = locala.BTU.readString();
          AppMethodBeat.o(56662);
          paramInt = 0;
          break;
        case 8:
          localt.tmP = locala.BTU.readString();
          AppMethodBeat.o(56662);
          paramInt = 0;
          break;
        case 9:
          localt.tmQ = locala.BTU.readString();
          AppMethodBeat.o(56662);
          paramInt = 0;
          break;
        case 10:
          localt.tnP = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(56662);
          paramInt = 0;
          break;
        case 11:
          localt.tnQ = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(56662);
          paramInt = 0;
          break;
        case 12:
          localt.tnR = locala.BTU.vd();
          AppMethodBeat.o(56662);
          paramInt = 0;
          break;
        case 13:
          localt.tnS = locala.BTU.readString();
          AppMethodBeat.o(56662);
          paramInt = 0;
          break;
        case 14:
          localt.pcj = locala.BTU.readString();
          AppMethodBeat.o(56662);
          paramInt = 0;
          break;
        case 16:
          localt.tnT = locala.BTU.readString();
          AppMethodBeat.o(56662);
          paramInt = 0;
          break;
        case 17:
          localt.tnU.add(locala.BTU.emu());
          AppMethodBeat.o(56662);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56662);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.a.t
 * JD-Core Version:    0.6.2
 */