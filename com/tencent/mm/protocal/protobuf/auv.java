package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class auv extends com.tencent.mm.bt.a
{
  public String jBB;
  public int luF;
  public String vLe;
  public String wbw;
  public bts wyX;
  public int wyY;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(73722);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wyX == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: NickName");
        AppMethodBeat.o(73722);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.luF);
      if (this.wyX != null)
      {
        paramArrayOfObject.iy(2, this.wyX.computeSize());
        this.wyX.writeFields(paramArrayOfObject);
      }
      if (this.vLe != null)
        paramArrayOfObject.e(3, this.vLe);
      if (this.wbw != null)
        paramArrayOfObject.e(4, this.wbw);
      if (this.jBB != null)
        paramArrayOfObject.e(5, this.jBB);
      paramArrayOfObject.iz(6, this.wyY);
      AppMethodBeat.o(73722);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.luF) + 0;
        paramInt = i;
        if (this.wyX != null)
          paramInt = i + e.a.a.a.ix(2, this.wyX.computeSize());
        i = paramInt;
        if (this.vLe != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.vLe);
        paramInt = i;
        if (this.wbw != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.wbw);
        i = paramInt;
        if (this.jBB != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.jBB);
        paramInt = i + e.a.a.b.b.a.bs(6, this.wyY);
        AppMethodBeat.o(73722);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wyX == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: NickName");
          AppMethodBeat.o(73722);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(73722);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        auv localauv = (auv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73722);
          break;
        case 1:
          localauv.luF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73722);
          paramInt = 0;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localauv.wyX = paramArrayOfObject;
          }
          AppMethodBeat.o(73722);
          paramInt = 0;
          break;
        case 3:
          localauv.vLe = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73722);
          paramInt = 0;
          break;
        case 4:
          localauv.wbw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73722);
          paramInt = 0;
          break;
        case 5:
          localauv.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73722);
          paramInt = 0;
          break;
        case 6:
          localauv.wyY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73722);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(73722);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.auv
 * JD-Core Version:    0.6.2
 */