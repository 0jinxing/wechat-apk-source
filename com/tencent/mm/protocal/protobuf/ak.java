package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ak extends bsr
{
  public int cME;
  public String vBu;
  public String vBv;
  public int vBw;
  public LinkedList<nx> vBz;

  public ak()
  {
    AppMethodBeat.i(88995);
    this.vBz = new LinkedList();
    AppMethodBeat.o(88995);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(88996);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 8, this.vBz);
      paramArrayOfObject.iz(3, this.cME);
      if (this.vBu != null)
        paramArrayOfObject.e(4, this.vBu);
      if (this.vBv != null)
        paramArrayOfObject.e(5, this.vBv);
      paramArrayOfObject.iz(6, this.vBw);
      AppMethodBeat.o(88996);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label691;
    label691: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 8, this.vBz) + e.a.a.b.b.a.bs(3, this.cME);
      paramInt = i;
      if (this.vBu != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vBu);
      i = paramInt;
      if (this.vBv != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vBv);
      paramInt = i + e.a.a.b.b.a.bs(6, this.vBw);
      AppMethodBeat.o(88996);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vBz.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(88996);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ak localak = (ak)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(88996);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localak.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(88996);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new nx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((nx)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localak.vBz.add(localObject1);
          }
          AppMethodBeat.o(88996);
          paramInt = i;
          break;
        case 3:
          localak.cME = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(88996);
          paramInt = i;
          break;
        case 4:
          localak.vBu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(88996);
          paramInt = i;
          break;
        case 5:
          localak.vBv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(88996);
          paramInt = i;
          break;
        case 6:
          localak.vBw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(88996);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(88996);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ak
 * JD-Core Version:    0.6.2
 */