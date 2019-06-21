package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class adj extends bsr
{
  public int Scene;
  public String fKh;
  public String ndT;
  public int vAM;
  public String vLo;
  public aw vRP;
  public String vXP;
  public String vYO;
  public String vYP;
  public String vYQ;
  public String vYR;
  public String wla;
  public String wld;
  public String wle;
  public int wlf;
  public String wlg;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56800);
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
      if (this.vYO != null)
        paramArrayOfObject.e(3, this.vYO);
      if (this.vLo != null)
        paramArrayOfObject.e(4, this.vLo);
      if (this.vYP != null)
        paramArrayOfObject.e(5, this.vYP);
      if (this.vYQ != null)
        paramArrayOfObject.e(6, this.vYQ);
      if (this.vYR != null)
        paramArrayOfObject.e(7, this.vYR);
      if (this.vXP != null)
        paramArrayOfObject.e(8, this.vXP);
      if (this.wla != null)
        paramArrayOfObject.e(9, this.wla);
      paramArrayOfObject.iz(10, this.vAM);
      if (this.ndT != null)
        paramArrayOfObject.e(11, this.ndT);
      if (this.wld != null)
        paramArrayOfObject.e(12, this.wld);
      if (this.wle != null)
        paramArrayOfObject.e(13, this.wle);
      if (this.vRP != null)
      {
        paramArrayOfObject.iy(14, this.vRP.computeSize());
        this.vRP.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(15, this.Scene);
      paramArrayOfObject.iz(16, this.wlf);
      if (this.wlg != null)
        paramArrayOfObject.e(17, this.wlg);
      AppMethodBeat.o(56800);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1404;
    label1404: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.fKh != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.fKh);
      paramInt = i;
      if (this.vYO != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vYO);
      i = paramInt;
      if (this.vLo != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vLo);
      int j = i;
      if (this.vYP != null)
        j = i + e.a.a.b.b.a.f(5, this.vYP);
      paramInt = j;
      if (this.vYQ != null)
        paramInt = j + e.a.a.b.b.a.f(6, this.vYQ);
      i = paramInt;
      if (this.vYR != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.vYR);
      paramInt = i;
      if (this.vXP != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vXP);
      i = paramInt;
      if (this.wla != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.wla);
      i += e.a.a.b.b.a.bs(10, this.vAM);
      paramInt = i;
      if (this.ndT != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.ndT);
      i = paramInt;
      if (this.wld != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.wld);
      paramInt = i;
      if (this.wle != null)
        paramInt = i + e.a.a.b.b.a.f(13, this.wle);
      i = paramInt;
      if (this.vRP != null)
        i = paramInt + e.a.a.a.ix(14, this.vRP.computeSize());
      i = i + e.a.a.b.b.a.bs(15, this.Scene) + e.a.a.b.b.a.bs(16, this.wlf);
      paramInt = i;
      if (this.wlg != null)
        paramInt = i + e.a.a.b.b.a.f(17, this.wlg);
      AppMethodBeat.o(56800);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56800);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        adj localadj = (adj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56800);
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
            localadj.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(56800);
          paramInt = i;
          break;
        case 2:
          localadj.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56800);
          paramInt = i;
          break;
        case 3:
          localadj.vYO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56800);
          paramInt = i;
          break;
        case 4:
          localadj.vLo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56800);
          paramInt = i;
          break;
        case 5:
          localadj.vYP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56800);
          paramInt = i;
          break;
        case 6:
          localadj.vYQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56800);
          paramInt = i;
          break;
        case 7:
          localadj.vYR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56800);
          paramInt = i;
          break;
        case 8:
          localadj.vXP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56800);
          paramInt = i;
          break;
        case 9:
          localadj.wla = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56800);
          paramInt = i;
          break;
        case 10:
          localadj.vAM = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56800);
          paramInt = i;
          break;
        case 11:
          localadj.ndT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56800);
          paramInt = i;
          break;
        case 12:
          localadj.wld = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56800);
          paramInt = i;
          break;
        case 13:
          localadj.wle = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56800);
          paramInt = i;
          break;
        case 14:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new aw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localadj.vRP = paramArrayOfObject;
          }
          AppMethodBeat.o(56800);
          paramInt = i;
          break;
        case 15:
          localadj.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56800);
          paramInt = i;
          break;
        case 16:
          localadj.wlf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56800);
          paramInt = i;
          break;
        case 17:
          localadj.wlg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56800);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56800);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.adj
 * JD-Core Version:    0.6.2
 */