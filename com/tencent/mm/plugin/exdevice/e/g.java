package com.tencent.mm.plugin.exdevice.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class g extends j
{
  public String jBG;
  public int luX;
  public int luY;
  public int luZ;
  public int lva;
  public int lvb;
  public String lvc;
  public int lvd;
  public String lve;
  public int lvf;
  public int lvg;
  public String lvh;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(19424);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.lvk == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(19424);
        throw paramArrayOfObject;
      }
      if (this.lvk != null)
      {
        paramArrayOfObject.iy(1, this.lvk.computeSize());
        this.lvk.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.luX);
      paramArrayOfObject.iz(3, this.luY);
      paramArrayOfObject.iz(4, this.luZ);
      paramArrayOfObject.iz(5, this.lva);
      paramArrayOfObject.iz(6, this.lvb);
      if (this.lvc != null)
        paramArrayOfObject.e(11, this.lvc);
      paramArrayOfObject.iz(12, this.lvd);
      if (this.jBG != null)
        paramArrayOfObject.e(13, this.jBG);
      if (this.lve != null)
        paramArrayOfObject.e(14, this.lve);
      paramArrayOfObject.iz(15, this.lvf);
      paramArrayOfObject.iz(16, this.lvg);
      if (this.lvh != null)
        paramArrayOfObject.e(17, this.lvh);
      AppMethodBeat.o(19424);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.lvk == null)
        break label1043;
    label1043: for (paramInt = e.a.a.a.ix(1, this.lvk.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.luX) + e.a.a.b.b.a.bs(3, this.luY) + e.a.a.b.b.a.bs(4, this.luZ) + e.a.a.b.b.a.bs(5, this.lva) + e.a.a.b.b.a.bs(6, this.lvb);
      paramInt = i;
      if (this.lvc != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.lvc);
      i = paramInt + e.a.a.b.b.a.bs(12, this.lvd);
      paramInt = i;
      if (this.jBG != null)
        paramInt = i + e.a.a.b.b.a.f(13, this.jBG);
      i = paramInt;
      if (this.lve != null)
        i = paramInt + e.a.a.b.b.a.f(14, this.lve);
      i = i + e.a.a.b.b.a.bs(15, this.lvf) + e.a.a.b.b.a.bs(16, this.lvg);
      paramInt = i;
      if (this.lvh != null)
        paramInt = i + e.a.a.b.b.a.f(17, this.lvh);
      AppMethodBeat.o(19424);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = j.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = j.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.lvk == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(19424);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(19424);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        g localg = (g)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        case 7:
        case 8:
        case 9:
        case 10:
        default:
          paramInt = -1;
          AppMethodBeat.o(19424);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new e();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((e)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, j.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localg.lvk = ((e)localObject1);
          }
          AppMethodBeat.o(19424);
          paramInt = i;
          break;
        case 2:
          localg.luX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(19424);
          paramInt = i;
          break;
        case 3:
          localg.luY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(19424);
          paramInt = i;
          break;
        case 4:
          localg.luZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(19424);
          paramInt = i;
          break;
        case 5:
          localg.lva = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(19424);
          paramInt = i;
          break;
        case 6:
          localg.lvb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(19424);
          paramInt = i;
          break;
        case 11:
          localg.lvc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(19424);
          paramInt = i;
          break;
        case 12:
          localg.lvd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(19424);
          paramInt = i;
          break;
        case 13:
          localg.jBG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(19424);
          paramInt = i;
          break;
        case 14:
          localg.lve = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(19424);
          paramInt = i;
          break;
        case 15:
          localg.lvf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(19424);
          paramInt = i;
          break;
        case 16:
          localg.lvg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(19424);
          paramInt = i;
          break;
        case 17:
          localg.lvh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(19424);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(19424);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.e.g
 * JD-Core Version:    0.6.2
 */