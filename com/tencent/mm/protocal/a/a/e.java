package com.tencent.mm.protocal.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class e extends com.tencent.mm.bt.a
{
  public int nettype;
  public int uin;
  public int vyR;
  public LinkedList<d> vyS;
  public String vzb;
  public String vzc;
  public String vzd;
  public String vze;
  public String vzf;
  public int vzg;

  public e()
  {
    AppMethodBeat.i(72820);
    this.vyS = new LinkedList();
    AppMethodBeat.o(72820);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(72821);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.uin);
      paramArrayOfObject.iz(2, this.vyR);
      paramArrayOfObject.iz(3, this.nettype);
      paramArrayOfObject.e(4, 8, this.vyS);
      if (this.vzb != null)
        paramArrayOfObject.e(5, this.vzb);
      if (this.vzc != null)
        paramArrayOfObject.e(6, this.vzc);
      if (this.vzd != null)
        paramArrayOfObject.e(7, this.vzd);
      if (this.vze != null)
        paramArrayOfObject.e(8, this.vze);
      if (this.vzf != null)
        paramArrayOfObject.e(9, this.vzf);
      paramArrayOfObject.iz(10, this.vzg);
      AppMethodBeat.o(72821);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.uin) + 0 + e.a.a.b.b.a.bs(2, this.vyR) + e.a.a.b.b.a.bs(3, this.nettype) + e.a.a.a.c(4, 8, this.vyS);
        i = paramInt;
        if (this.vzb != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.vzb);
        paramInt = i;
        if (this.vzc != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.vzc);
        i = paramInt;
        if (this.vzd != null)
          i = paramInt + e.a.a.b.b.a.f(7, this.vzd);
        paramInt = i;
        if (this.vze != null)
          paramInt = i + e.a.a.b.b.a.f(8, this.vze);
        i = paramInt;
        if (this.vzf != null)
          i = paramInt + e.a.a.b.b.a.f(9, this.vzf);
        paramInt = i + e.a.a.b.b.a.bs(10, this.vzg);
        AppMethodBeat.o(72821);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vyS.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(72821);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        e locale = (e)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(72821);
          break;
        case 1:
          locale.uin = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72821);
          paramInt = 0;
          break;
        case 2:
          locale.vyR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72821);
          paramInt = 0;
          break;
        case 3:
          locale.nettype = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72821);
          paramInt = 0;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new d();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((d)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locale.vyS.add(localObject1);
          }
          AppMethodBeat.o(72821);
          paramInt = 0;
          break;
        case 5:
          locale.vzb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(72821);
          paramInt = 0;
          break;
        case 6:
          locale.vzc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(72821);
          paramInt = 0;
          break;
        case 7:
          locale.vzd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(72821);
          paramInt = 0;
          break;
        case 8:
          locale.vze = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(72821);
          paramInt = 0;
          break;
        case 9:
          locale.vzf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(72821);
          paramInt = 0;
          break;
        case 10:
          locale.vzg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72821);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(72821);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.a.e
 * JD-Core Version:    0.6.2
 */