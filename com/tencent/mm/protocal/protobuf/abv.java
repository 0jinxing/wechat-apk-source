package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class abv extends com.tencent.mm.bt.a
{
  public String pOz;
  public LinkedList<abw> vPg;
  public String vWF;
  public String wjd;
  public long wje;
  public long wjf;
  public String wjg;
  public long wjh;

  public abv()
  {
    AppMethodBeat.i(56790);
    this.vPg = new LinkedList();
    AppMethodBeat.o(56790);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56791);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wjd != null)
        paramArrayOfObject.e(1, this.wjd);
      paramArrayOfObject.e(2, 8, this.vPg);
      paramArrayOfObject.ai(3, this.wje);
      paramArrayOfObject.ai(4, this.wjf);
      if (this.wjg != null)
        paramArrayOfObject.e(5, this.wjg);
      if (this.pOz != null)
        paramArrayOfObject.e(6, this.pOz);
      paramArrayOfObject.ai(7, this.wjh);
      if (this.vWF != null)
        paramArrayOfObject.e(8, this.vWF);
      AppMethodBeat.o(56791);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wjd == null)
        break label708;
    label708: for (paramInt = e.a.a.b.b.a.f(1, this.wjd) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 8, this.vPg) + e.a.a.b.b.a.o(3, this.wje) + e.a.a.b.b.a.o(4, this.wjf);
      paramInt = i;
      if (this.wjg != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wjg);
      i = paramInt;
      if (this.pOz != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.pOz);
      i += e.a.a.b.b.a.o(7, this.wjh);
      paramInt = i;
      if (this.vWF != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vWF);
      AppMethodBeat.o(56791);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vPg.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56791);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        abv localabv = (abv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56791);
          break;
        case 1:
          localabv.wjd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56791);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new abw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localabv.vPg.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56791);
          paramInt = i;
          break;
        case 3:
          localabv.wje = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56791);
          paramInt = i;
          break;
        case 4:
          localabv.wjf = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56791);
          paramInt = i;
          break;
        case 5:
          localabv.wjg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56791);
          paramInt = i;
          break;
        case 6:
          localabv.pOz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56791);
          paramInt = i;
          break;
        case 7:
          localabv.wjh = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56791);
          paramInt = i;
          break;
        case 8:
          localabv.vWF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56791);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56791);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.abv
 * JD-Core Version:    0.6.2
 */