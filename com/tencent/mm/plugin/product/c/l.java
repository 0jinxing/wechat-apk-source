package com.tencent.mm.plugin.product.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public class l extends com.tencent.mm.bt.a
{
  public String phU;
  public int phV;
  public LinkedList<e> phW;
  public int phq;
  public String url;

  public l()
  {
    AppMethodBeat.i(56635);
    this.phW = new LinkedList();
    AppMethodBeat.o(56635);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56636);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.phU == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: id_info");
        AppMethodBeat.o(56636);
        throw paramArrayOfObject;
      }
      if (this.phU != null)
        paramArrayOfObject.e(1, this.phU);
      paramArrayOfObject.iz(2, this.phV);
      if (this.url != null)
        paramArrayOfObject.e(3, this.url);
      paramArrayOfObject.e(4, 8, this.phW);
      paramArrayOfObject.iz(5, this.phq);
      AppMethodBeat.o(56636);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.phU == null)
        break label579;
    label579: for (paramInt = e.a.a.b.b.a.f(1, this.phU) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.phV);
      paramInt = i;
      if (this.url != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.url);
      paramInt = paramInt + e.a.a.a.c(4, 8, this.phW) + e.a.a.b.b.a.bs(5, this.phq);
      AppMethodBeat.o(56636);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.phW.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.phU == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: id_info");
          AppMethodBeat.o(56636);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56636);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        l locall = (l)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56636);
          break;
        case 1:
          locall.phU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56636);
          paramInt = i;
          break;
        case 2:
          locall.phV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56636);
          paramInt = i;
          break;
        case 3:
          locall.url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56636);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new e();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locall.phW.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56636);
          paramInt = i;
          break;
        case 5:
          locall.phq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56636);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56636);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.c.l
 * JD-Core Version:    0.6.2
 */