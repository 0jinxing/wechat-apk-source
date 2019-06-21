package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class gk extends com.tencent.mm.bt.a
{
  public String csB;
  public String username;
  public int vIG;
  public ble vIH;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(114949);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.username != null)
        paramArrayOfObject.e(1, this.username);
      paramArrayOfObject.iz(2, this.vIG);
      if (this.vIH != null)
      {
        paramArrayOfObject.iy(3, this.vIH.computeSize());
        this.vIH.writeFields(paramArrayOfObject);
      }
      if (this.csB != null)
        paramArrayOfObject.e(10, this.csB);
      AppMethodBeat.o(114949);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.username == null)
        break label512;
    label512: for (paramInt = e.a.a.b.b.a.f(1, this.username) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vIG);
      paramInt = i;
      if (this.vIH != null)
        paramInt = i + e.a.a.a.ix(3, this.vIH.computeSize());
      i = paramInt;
      if (this.csB != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.csB);
      AppMethodBeat.o(114949);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(114949);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        gk localgk = (gk)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(114949);
          break;
        case 1:
          localgk.username = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(114949);
          paramInt = i;
          break;
        case 2:
          localgk.vIG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(114949);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ble();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localgk.vIH = paramArrayOfObject;
          }
          AppMethodBeat.o(114949);
          paramInt = i;
          break;
        case 10:
          localgk.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(114949);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(114949);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.gk
 * JD-Core Version:    0.6.2
 */