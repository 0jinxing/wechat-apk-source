package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class sn extends bsr
{
  public int scene;
  public String vEG;
  public String vMR;
  public int vZW;
  public String vZX;
  public LinkedList<sm> vZY;
  public int vZZ;
  public bxk waa;
  public byj wab;

  public sn()
  {
    AppMethodBeat.i(11737);
    this.vZY = new LinkedList();
    AppMethodBeat.o(11737);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11738);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vZW);
      if (this.vZX != null)
        paramArrayOfObject.e(3, this.vZX);
      if (this.vMR != null)
        paramArrayOfObject.e(4, this.vMR);
      if (this.vEG != null)
        paramArrayOfObject.e(5, this.vEG);
      paramArrayOfObject.e(6, 8, this.vZY);
      paramArrayOfObject.iz(7, this.scene);
      paramArrayOfObject.iz(8, this.vZZ);
      if (this.waa != null)
      {
        paramArrayOfObject.iy(9, this.waa.computeSize());
        this.waa.writeFields(paramArrayOfObject);
      }
      if (this.wab != null)
      {
        paramArrayOfObject.iy(10, this.wab.computeSize());
        this.wab.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(11738);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1142;
    label1142: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vZW);
      paramInt = i;
      if (this.vZX != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vZX);
      i = paramInt;
      if (this.vMR != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vMR);
      paramInt = i;
      if (this.vEG != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vEG);
      i = paramInt + e.a.a.a.c(6, 8, this.vZY) + e.a.a.b.b.a.bs(7, this.scene) + e.a.a.b.b.a.bs(8, this.vZZ);
      paramInt = i;
      if (this.waa != null)
        paramInt = i + e.a.a.a.ix(9, this.waa.computeSize());
      i = paramInt;
      if (this.wab != null)
        i = paramInt + e.a.a.a.ix(10, this.wab.computeSize());
      AppMethodBeat.o(11738);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vZY.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(11738);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        sn localsn = (sn)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11738);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localsn.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(11738);
          paramInt = i;
          break;
        case 2:
          localsn.vZW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11738);
          paramInt = i;
          break;
        case 3:
          localsn.vZX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11738);
          paramInt = i;
          break;
        case 4:
          localsn.vMR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11738);
          paramInt = i;
          break;
        case 5:
          localsn.vEG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11738);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new sm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((sm)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localsn.vZY.add(localObject1);
          }
          AppMethodBeat.o(11738);
          paramInt = i;
          break;
        case 7:
          localsn.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11738);
          paramInt = i;
          break;
        case 8:
          localsn.vZZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11738);
          paramInt = i;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bxk();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bxk)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localsn.waa = ((bxk)localObject1);
          }
          AppMethodBeat.o(11738);
          paramInt = i;
          break;
        case 10:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new byj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((byj)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localsn.wab = ((byj)localObject1);
          }
          AppMethodBeat.o(11738);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11738);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.sn
 * JD-Core Version:    0.6.2
 */