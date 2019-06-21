package com.tencent.mm.plugin.wallet.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class j extends com.tencent.mm.bt.a
{
  public double tmT;
  public LinkedList<t> tmV;
  public double tna;
  public double tnb;
  public int tnc;
  public String tnd;
  public String tne;
  public b tnj;
  public String tnk;
  public double tnl;
  public LinkedList<f> tnm;

  public j()
  {
    AppMethodBeat.i(56653);
    this.tnm = new LinkedList();
    this.tmV = new LinkedList();
    AppMethodBeat.o(56653);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56654);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.tnk != null)
        paramArrayOfObject.e(1, this.tnk);
      paramArrayOfObject.f(2, this.tnl);
      paramArrayOfObject.f(3, this.tmT);
      paramArrayOfObject.e(4, 8, this.tnm);
      paramArrayOfObject.e(5, 8, this.tmV);
      paramArrayOfObject.f(6, this.tna);
      paramArrayOfObject.f(7, this.tnb);
      paramArrayOfObject.iz(8, this.tnc);
      if (this.tnd != null)
        paramArrayOfObject.e(9, this.tnd);
      if (this.tne != null)
        paramArrayOfObject.e(10, this.tne);
      if (this.tnj != null)
        paramArrayOfObject.c(11, this.tnj);
      AppMethodBeat.o(56654);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.tnk == null)
        break label950;
    label950: for (paramInt = e.a.a.b.b.a.f(1, this.tnk) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + (e.a.a.b.b.a.fv(2) + 8) + (e.a.a.b.b.a.fv(3) + 8) + e.a.a.a.c(4, 8, this.tnm) + e.a.a.a.c(5, 8, this.tmV) + (e.a.a.b.b.a.fv(6) + 8) + (e.a.a.b.b.a.fv(7) + 8) + e.a.a.b.b.a.bs(8, this.tnc);
      i = paramInt;
      if (this.tnd != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.tnd);
      paramInt = i;
      if (this.tne != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.tne);
      i = paramInt;
      if (this.tnj != null)
        i = paramInt + e.a.a.b.b.a.b(11, this.tnj);
      AppMethodBeat.o(56654);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.tnm.clear();
        this.tmV.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56654);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        j localj = (j)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56654);
          break;
        case 1:
          localj.tnk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56654);
          paramInt = i;
          break;
        case 2:
          localj.tnl = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(56654);
          paramInt = i;
          break;
        case 3:
          localj.tmT = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(56654);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new f();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localj.tnm.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56654);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localj.tmV.add(localObject1);
          }
          AppMethodBeat.o(56654);
          paramInt = i;
          break;
        case 6:
          localj.tna = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(56654);
          paramInt = i;
          break;
        case 7:
          localj.tnb = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(56654);
          paramInt = i;
          break;
        case 8:
          localj.tnc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56654);
          paramInt = i;
          break;
        case 9:
          localj.tnd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56654);
          paramInt = i;
          break;
        case 10:
          localj.tne = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56654);
          paramInt = i;
          break;
        case 11:
          localj.tnj = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(56654);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56654);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.a.j
 * JD-Core Version:    0.6.2
 */