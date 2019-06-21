package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class j extends com.tencent.mm.bt.a
{
  public String content;
  public int ptH;
  public String ptI;
  public LinkedList<o> ptJ;
  public LinkedList<o> ptK;
  public LinkedList<o> ptL;
  public LinkedList<ai> ptM;
  public String ptN;
  public int ptO;

  public j()
  {
    AppMethodBeat.i(67931);
    this.ptJ = new LinkedList();
    this.ptK = new LinkedList();
    this.ptL = new LinkedList();
    this.ptM = new LinkedList();
    this.ptO = 5;
    AppMethodBeat.o(67931);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(67932);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.content == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: content");
        AppMethodBeat.o(67932);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.ptH);
      if (this.ptI != null)
        paramArrayOfObject.e(2, this.ptI);
      paramArrayOfObject.e(3, 8, this.ptJ);
      paramArrayOfObject.e(4, 8, this.ptK);
      paramArrayOfObject.e(5, 8, this.ptL);
      paramArrayOfObject.e(6, 8, this.ptM);
      if (this.ptN != null)
        paramArrayOfObject.e(7, this.ptN);
      if (this.content != null)
        paramArrayOfObject.e(8, this.content);
      paramArrayOfObject.iz(9, this.ptO);
      AppMethodBeat.o(67932);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.ptH) + 0;
        paramInt = i;
        if (this.ptI != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.ptI);
        i = paramInt + e.a.a.a.c(3, 8, this.ptJ) + e.a.a.a.c(4, 8, this.ptK) + e.a.a.a.c(5, 8, this.ptL) + e.a.a.a.c(6, 8, this.ptM);
        paramInt = i;
        if (this.ptN != null)
          paramInt = i + e.a.a.b.b.a.f(7, this.ptN);
        i = paramInt;
        if (this.content != null)
          i = paramInt + e.a.a.b.b.a.f(8, this.content);
        paramInt = i + e.a.a.b.b.a.bs(9, this.ptO);
        AppMethodBeat.o(67932);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.ptJ.clear();
        this.ptK.clear();
        this.ptL.clear();
        this.ptM.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.content == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: content");
          AppMethodBeat.o(67932);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(67932);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        j localj = (j)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(67932);
          break;
        case 1:
          localj.ptH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(67932);
          paramInt = 0;
          break;
        case 2:
          localj.ptI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(67932);
          paramInt = 0;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new o();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((o)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localj.ptJ.add(localObject1);
          }
          AppMethodBeat.o(67932);
          paramInt = 0;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new o();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localj.ptK.add(paramArrayOfObject);
          }
          AppMethodBeat.o(67932);
          paramInt = 0;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new o();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((o)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localj.ptL.add(localObject1);
          }
          AppMethodBeat.o(67932);
          paramInt = 0;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ai();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ai)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localj.ptM.add(localObject1);
          }
          AppMethodBeat.o(67932);
          paramInt = 0;
          break;
        case 7:
          localj.ptN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(67932);
          paramInt = 0;
          break;
        case 8:
          localj.content = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(67932);
          paramInt = 0;
          break;
        case 9:
          localj.ptO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(67932);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(67932);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.j
 * JD-Core Version:    0.6.2
 */