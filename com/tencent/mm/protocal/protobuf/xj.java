package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class xj extends bsr
{
  public String fKh;
  public String fKk;
  public String jBB;
  public int jCt;
  public long ptF;
  public int ptw;
  public int ptx;
  public int pty;
  public int vFE;
  public String wdi;
  public int wdj;
  public int wdk;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(135756);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.fKh != null)
        paramArrayOfObject.e(2, this.fKh);
      paramArrayOfObject.iz(3, this.vFE);
      if (this.fKk != null)
        paramArrayOfObject.e(4, this.fKk);
      if (this.jBB != null)
        paramArrayOfObject.e(5, this.jBB);
      paramArrayOfObject.iz(6, this.ptw);
      paramArrayOfObject.iz(7, this.ptx);
      paramArrayOfObject.iz(8, this.pty);
      if (this.wdi != null)
        paramArrayOfObject.e(9, this.wdi);
      paramArrayOfObject.iz(10, this.wdj);
      paramArrayOfObject.iz(11, this.jCt);
      paramArrayOfObject.iz(12, this.wdk);
      paramArrayOfObject.ai(13, this.ptF);
      AppMethodBeat.o(135756);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label959;
    label959: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.fKh != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.fKh);
      i += e.a.a.b.b.a.bs(3, this.vFE);
      paramInt = i;
      if (this.fKk != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.fKk);
      i = paramInt;
      if (this.jBB != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.jBB);
      i = i + e.a.a.b.b.a.bs(6, this.ptw) + e.a.a.b.b.a.bs(7, this.ptx) + e.a.a.b.b.a.bs(8, this.pty);
      paramInt = i;
      if (this.wdi != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.wdi);
      paramInt = paramInt + e.a.a.b.b.a.bs(10, this.wdj) + e.a.a.b.b.a.bs(11, this.jCt) + e.a.a.b.b.a.bs(12, this.wdk) + e.a.a.b.b.a.o(13, this.ptF);
      AppMethodBeat.o(135756);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(135756);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        xj localxj = (xj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(135756);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localxj.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(135756);
          paramInt = i;
          break;
        case 2:
          localxj.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(135756);
          paramInt = i;
          break;
        case 3:
          localxj.vFE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135756);
          paramInt = i;
          break;
        case 4:
          localxj.fKk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(135756);
          paramInt = i;
          break;
        case 5:
          localxj.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(135756);
          paramInt = i;
          break;
        case 6:
          localxj.ptw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135756);
          paramInt = i;
          break;
        case 7:
          localxj.ptx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135756);
          paramInt = i;
          break;
        case 8:
          localxj.pty = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135756);
          paramInt = i;
          break;
        case 9:
          localxj.wdi = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(135756);
          paramInt = i;
          break;
        case 10:
          localxj.wdj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135756);
          paramInt = i;
          break;
        case 11:
          localxj.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135756);
          paramInt = i;
          break;
        case 12:
          localxj.wdk = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135756);
          paramInt = i;
          break;
        case 13:
          localxj.ptF = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(135756);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(135756);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.xj
 * JD-Core Version:    0.6.2
 */