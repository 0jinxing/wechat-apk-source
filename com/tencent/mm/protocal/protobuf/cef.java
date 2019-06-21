package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class cef extends com.tencent.mm.bt.a
{
  public long vQE;
  public cer xdJ;
  public String xdK;
  public int xds;
  public LinkedList<Integer> xeb;

  public cef()
  {
    AppMethodBeat.i(56519);
    this.xeb = new LinkedList();
    AppMethodBeat.o(56519);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56520);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.vQE);
      if (this.xdK != null)
        paramArrayOfObject.e(2, this.xdK);
      if (this.xdJ != null)
      {
        paramArrayOfObject.iy(3, this.xdJ.computeSize());
        this.xdJ.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(4, this.xds);
      paramArrayOfObject.f(5, 2, this.xeb);
      AppMethodBeat.o(56520);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.o(1, this.vQE) + 0;
        paramInt = i;
        if (this.xdK != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.xdK);
        i = paramInt;
        if (this.xdJ != null)
          i = paramInt + e.a.a.a.ix(3, this.xdJ.computeSize());
        paramInt = i + e.a.a.b.b.a.bs(4, this.xds) + e.a.a.a.d(5, 2, this.xeb);
        AppMethodBeat.o(56520);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xeb.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56520);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cef localcef = (cef)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56520);
          break;
        case 1:
          localcef.vQE = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56520);
          paramInt = 0;
          break;
        case 2:
          localcef.xdK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56520);
          paramInt = 0;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cer();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcef.xdJ = paramArrayOfObject;
          }
          AppMethodBeat.o(56520);
          paramInt = 0;
          break;
        case 4:
          localcef.xds = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56520);
          paramInt = 0;
          break;
        case 5:
          localcef.xeb = new e.a.a.a.a(((e.a.a.a.a)localObject1).BTU.emu().wR, unknownTagHandler).BTU.emt();
          AppMethodBeat.o(56520);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56520);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cef
 * JD-Core Version:    0.6.2
 */