package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cdj extends bsr
{
  public String ndF;
  public String ndG;
  public String vFF;
  public int xcZ;
  public int xda;
  public LinkedList<cdl> xdb;
  public cdi xdc;
  public int xdd;
  public LinkedList<cdi> xde;

  public cdj()
  {
    AppMethodBeat.i(80191);
    this.xdb = new LinkedList();
    this.xde = new LinkedList();
    AppMethodBeat.o(80191);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80192);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.xcZ);
      if (this.ndG != null)
        paramArrayOfObject.e(3, this.ndG);
      if (this.ndF != null)
        paramArrayOfObject.e(4, this.ndF);
      if (this.vFF != null)
        paramArrayOfObject.e(5, this.vFF);
      paramArrayOfObject.iz(6, this.xda);
      paramArrayOfObject.e(7, 8, this.xdb);
      if (this.xdc != null)
      {
        paramArrayOfObject.iy(8, this.xdc.computeSize());
        this.xdc.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(9, this.xdd);
      paramArrayOfObject.e(10, 8, this.xde);
      AppMethodBeat.o(80192);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1104;
    label1104: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.xcZ);
      paramInt = i;
      if (this.ndG != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.ndG);
      i = paramInt;
      if (this.ndF != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.ndF);
      paramInt = i;
      if (this.vFF != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vFF);
      i = paramInt + e.a.a.b.b.a.bs(6, this.xda) + e.a.a.a.c(7, 8, this.xdb);
      paramInt = i;
      if (this.xdc != null)
        paramInt = i + e.a.a.a.ix(8, this.xdc.computeSize());
      paramInt = paramInt + e.a.a.b.b.a.bs(9, this.xdd) + e.a.a.a.c(10, 8, this.xde);
      AppMethodBeat.o(80192);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xdb.clear();
        this.xde.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80192);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cdj localcdj = (cdj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80192);
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
            localcdj.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(80192);
          paramInt = i;
          break;
        case 2:
          localcdj.xcZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80192);
          paramInt = i;
          break;
        case 3:
          localcdj.ndG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80192);
          paramInt = i;
          break;
        case 4:
          localcdj.ndF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80192);
          paramInt = i;
          break;
        case 5:
          localcdj.vFF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80192);
          paramInt = i;
          break;
        case 6:
          localcdj.xda = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80192);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cdl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cdl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcdj.xdb.add(localObject1);
          }
          AppMethodBeat.o(80192);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cdi();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cdi)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcdj.xdc = ((cdi)localObject1);
          }
          AppMethodBeat.o(80192);
          paramInt = i;
          break;
        case 9:
          localcdj.xdd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80192);
          paramInt = i;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cdi();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcdj.xde.add(paramArrayOfObject);
          }
          AppMethodBeat.o(80192);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80192);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cdj
 * JD-Core Version:    0.6.2
 */