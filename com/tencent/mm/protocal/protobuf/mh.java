package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class mh extends com.tencent.mm.bt.a
{
  public String Title;
  public int jBV;
  public LinkedList<mn> naO;
  public int vOq;
  public long vQd;
  public int vQe;
  public LinkedList<String> vQf;
  public String vQg;

  public mh()
  {
    AppMethodBeat.i(124294);
    this.vQf = new LinkedList();
    this.naO = new LinkedList();
    AppMethodBeat.o(124294);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(124295);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vQg == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SearchID");
        AppMethodBeat.o(124295);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.ai(1, this.vQd);
      paramArrayOfObject.iz(2, this.vQe);
      if (this.Title != null)
        paramArrayOfObject.e(3, this.Title);
      paramArrayOfObject.e(4, 1, this.vQf);
      paramArrayOfObject.e(5, 8, this.naO);
      paramArrayOfObject.iz(6, this.jBV);
      if (this.vQg != null)
        paramArrayOfObject.e(7, this.vQg);
      paramArrayOfObject.iz(8, this.vOq);
      AppMethodBeat.o(124295);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.o(1, this.vQd) + 0 + e.a.a.b.b.a.bs(2, this.vQe);
        paramInt = i;
        if (this.Title != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.Title);
        i = paramInt + e.a.a.a.c(4, 1, this.vQf) + e.a.a.a.c(5, 8, this.naO) + e.a.a.b.b.a.bs(6, this.jBV);
        paramInt = i;
        if (this.vQg != null)
          paramInt = i + e.a.a.b.b.a.f(7, this.vQg);
        paramInt += e.a.a.b.b.a.bs(8, this.vOq);
        AppMethodBeat.o(124295);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vQf.clear();
        this.naO.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vQg == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SearchID");
          AppMethodBeat.o(124295);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(124295);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        mh localmh = (mh)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124295);
          break;
        case 1:
          localmh.vQd = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(124295);
          paramInt = 0;
          break;
        case 2:
          localmh.vQe = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124295);
          paramInt = 0;
          break;
        case 3:
          localmh.Title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124295);
          paramInt = 0;
          break;
        case 4:
          localmh.vQf.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(124295);
          paramInt = 0;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new mn();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localmh.naO.add(paramArrayOfObject);
          }
          AppMethodBeat.o(124295);
          paramInt = 0;
          break;
        case 6:
          localmh.jBV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124295);
          paramInt = 0;
          break;
        case 7:
          localmh.vQg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124295);
          paramInt = 0;
          break;
        case 8:
          localmh.vOq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124295);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(124295);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.mh
 * JD-Core Version:    0.6.2
 */