package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ui extends com.tencent.mm.bt.a
{
  public int state;
  public cgv vCN;
  public String vJS;
  public LinkedList<cgv> vTB;
  public LinkedList<cgv> wbU;
  public String wbV;

  public ui()
  {
    AppMethodBeat.i(48826);
    this.vTB = new LinkedList();
    this.wbU = new LinkedList();
    AppMethodBeat.o(48826);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48827);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.state);
      if (this.vCN != null)
      {
        paramArrayOfObject.iy(2, this.vCN.computeSize());
        this.vCN.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(3, 8, this.vTB);
      paramArrayOfObject.e(4, 8, this.wbU);
      if (this.wbV != null)
        paramArrayOfObject.e(5, this.wbV);
      if (this.vJS != null)
        paramArrayOfObject.e(6, this.vJS);
      AppMethodBeat.o(48827);
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
        if (this.vCN != null)
          paramInt = i + e.a.a.a.ix(2, this.vCN.computeSize());
        i = paramInt + e.a.a.a.c(3, 8, this.vTB) + e.a.a.a.c(4, 8, this.wbU);
        paramInt = i;
        if (this.wbV != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.wbV);
        i = paramInt;
        if (this.vJS != null)
          i = paramInt + e.a.a.b.b.a.f(6, this.vJS);
        AppMethodBeat.o(48827);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vTB.clear();
        this.wbU.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48827);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ui localui = (ui)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48827);
          break;
        case 1:
          localui.state = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48827);
          paramInt = 0;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cgv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localui.vCN = paramArrayOfObject;
          }
          AppMethodBeat.o(48827);
          paramInt = 0;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cgv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cgv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localui.vTB.add(localObject1);
          }
          AppMethodBeat.o(48827);
          paramInt = 0;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cgv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cgv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localui.wbU.add(localObject1);
          }
          AppMethodBeat.o(48827);
          paramInt = 0;
          break;
        case 5:
          localui.wbV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48827);
          paramInt = 0;
          break;
        case 6:
          localui.vJS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48827);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(48827);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ui
 * JD-Core Version:    0.6.2
 */