package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class btr extends com.tencent.mm.bt.a
{
  public int type;
  public String url;
  public chf wVC;
  public xb wVD;
  public int wVE;
  public boolean wVF;
  public ux wVG;
  public ba wVH;
  public LinkedList<xc> wct;

  public btr()
  {
    AppMethodBeat.i(48961);
    this.wct = new LinkedList();
    AppMethodBeat.o(48961);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48962);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.type);
      if (this.url != null)
        paramArrayOfObject.e(2, this.url);
      if (this.wVC != null)
      {
        paramArrayOfObject.iy(3, this.wVC.computeSize());
        this.wVC.writeFields(paramArrayOfObject);
      }
      if (this.wVD != null)
      {
        paramArrayOfObject.iy(4, this.wVD.computeSize());
        this.wVD.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.wVE);
      paramArrayOfObject.aO(6, this.wVF);
      paramArrayOfObject.e(7, 8, this.wct);
      if (this.wVG != null)
      {
        paramArrayOfObject.iy(8, this.wVG.computeSize());
        this.wVG.writeFields(paramArrayOfObject);
      }
      if (this.wVH != null)
      {
        paramArrayOfObject.iy(9, this.wVH.computeSize());
        this.wVH.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(48962);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.type) + 0;
        paramInt = i;
        if (this.url != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.url);
        i = paramInt;
        if (this.wVC != null)
          i = paramInt + e.a.a.a.ix(3, this.wVC.computeSize());
        paramInt = i;
        if (this.wVD != null)
          paramInt = i + e.a.a.a.ix(4, this.wVD.computeSize());
        i = paramInt + e.a.a.b.b.a.bs(5, this.wVE) + (e.a.a.b.b.a.fv(6) + 1) + e.a.a.a.c(7, 8, this.wct);
        paramInt = i;
        if (this.wVG != null)
          paramInt = i + e.a.a.a.ix(8, this.wVG.computeSize());
        i = paramInt;
        if (this.wVH != null)
          i = paramInt + e.a.a.a.ix(9, this.wVH.computeSize());
        AppMethodBeat.o(48962);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wct.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48962);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        btr localbtr = (btr)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48962);
          break;
        case 1:
          localbtr.type = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48962);
          paramInt = 0;
          break;
        case 2:
          localbtr.url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48962);
          paramInt = 0;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new chf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((chf)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbtr.wVC = ((chf)localObject1);
          }
          AppMethodBeat.o(48962);
          paramInt = 0;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new xb();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbtr.wVD = paramArrayOfObject;
          }
          AppMethodBeat.o(48962);
          paramInt = 0;
          break;
        case 5:
          localbtr.wVE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48962);
          paramInt = 0;
          break;
        case 6:
          localbtr.wVF = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(48962);
          paramInt = 0;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new xc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbtr.wct.add(paramArrayOfObject);
          }
          AppMethodBeat.o(48962);
          paramInt = 0;
          break;
        case 8:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ux();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbtr.wVG = paramArrayOfObject;
          }
          AppMethodBeat.o(48962);
          paramInt = 0;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ba();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbtr.wVH = paramArrayOfObject;
          }
          AppMethodBeat.o(48962);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(48962);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.btr
 * JD-Core Version:    0.6.2
 */