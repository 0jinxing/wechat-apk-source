package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ms extends com.tencent.mm.bt.a
{
  public int kdC;
  public int state;
  public String text;
  public btr vCP;
  public String vJS;
  public int vQJ;
  public auj vQK;
  public ta vQL;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48784);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.state);
      if (this.vCP != null)
      {
        paramArrayOfObject.iy(2, this.vCP.computeSize());
        this.vCP.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.vQJ);
      if (this.vQK != null)
      {
        paramArrayOfObject.iy(4, this.vQK.computeSize());
        this.vQK.writeFields(paramArrayOfObject);
      }
      if (this.text != null)
        paramArrayOfObject.e(5, this.text);
      if (this.vJS != null)
        paramArrayOfObject.e(6, this.vJS);
      paramArrayOfObject.iz(7, this.kdC);
      if (this.vQL != null)
      {
        paramArrayOfObject.iy(8, this.vQL.computeSize());
        this.vQL.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(48784);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.state) + 0;
        paramInt = i;
        if (this.vCP != null)
          paramInt = i + e.a.a.a.ix(2, this.vCP.computeSize());
        paramInt += e.a.a.b.b.a.bs(3, this.vQJ);
        i = paramInt;
        if (this.vQK != null)
          i = paramInt + e.a.a.a.ix(4, this.vQK.computeSize());
        paramInt = i;
        if (this.text != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.text);
        i = paramInt;
        if (this.vJS != null)
          i = paramInt + e.a.a.b.b.a.f(6, this.vJS);
        i += e.a.a.b.b.a.bs(7, this.kdC);
        paramInt = i;
        if (this.vQL != null)
          paramInt = i + e.a.a.a.ix(8, this.vQL.computeSize());
        AppMethodBeat.o(48784);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48784);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ms localms = (ms)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48784);
          break;
        case 1:
          localms.state = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48784);
          paramInt = 0;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new btr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localms.vCP = paramArrayOfObject;
          }
          AppMethodBeat.o(48784);
          paramInt = 0;
          break;
        case 3:
          localms.vQJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48784);
          paramInt = 0;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new auj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localms.vQK = paramArrayOfObject;
          }
          AppMethodBeat.o(48784);
          paramInt = 0;
          break;
        case 5:
          localms.text = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48784);
          paramInt = 0;
          break;
        case 6:
          localms.vJS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48784);
          paramInt = 0;
          break;
        case 7:
          localms.kdC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48784);
          paramInt = 0;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ta();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ta)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localms.vQL = ((ta)localObject1);
          }
          AppMethodBeat.o(48784);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(48784);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ms
 * JD-Core Version:    0.6.2
 */