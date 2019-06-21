package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class akx extends bsr
{
  public int ptD;
  public long ptF;
  public int ptw;
  public int ptx;
  public int pty;
  public bts vEB;
  public bts vEC;
  public int wqw;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80075);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vEB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: FromUserName");
        AppMethodBeat.o(80075);
        throw paramArrayOfObject;
      }
      if (this.vEC == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ToUserName");
        AppMethodBeat.o(80075);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.ptD);
      if (this.vEB != null)
      {
        paramArrayOfObject.iy(3, this.vEB.computeSize());
        this.vEB.writeFields(paramArrayOfObject);
      }
      if (this.vEC != null)
      {
        paramArrayOfObject.iy(4, this.vEC.computeSize());
        this.vEC.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.ptw);
      paramArrayOfObject.iz(6, this.ptx);
      paramArrayOfObject.iz(7, this.pty);
      paramArrayOfObject.iz(8, this.wqw);
      paramArrayOfObject.ai(9, this.ptF);
      AppMethodBeat.o(80075);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1016;
    label1016: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.ptD);
      paramInt = i;
      if (this.vEB != null)
        paramInt = i + e.a.a.a.ix(3, this.vEB.computeSize());
      i = paramInt;
      if (this.vEC != null)
        i = paramInt + e.a.a.a.ix(4, this.vEC.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(5, this.ptw) + e.a.a.b.b.a.bs(6, this.ptx) + e.a.a.b.b.a.bs(7, this.pty) + e.a.a.b.b.a.bs(8, this.wqw) + e.a.a.b.b.a.o(9, this.ptF);
      AppMethodBeat.o(80075);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vEB == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: FromUserName");
          AppMethodBeat.o(80075);
          throw paramArrayOfObject;
        }
        if (this.vEC == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ToUserName");
          AppMethodBeat.o(80075);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80075);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        akx localakx = (akx)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80075);
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
            localakx.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(80075);
          paramInt = i;
          break;
        case 2:
          localakx.ptD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80075);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localakx.vEB = paramArrayOfObject;
          }
          AppMethodBeat.o(80075);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localakx.vEC = paramArrayOfObject;
          }
          AppMethodBeat.o(80075);
          paramInt = i;
          break;
        case 5:
          localakx.ptw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80075);
          paramInt = i;
          break;
        case 6:
          localakx.ptx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80075);
          paramInt = i;
          break;
        case 7:
          localakx.pty = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80075);
          paramInt = i;
          break;
        case 8:
          localakx.wqw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80075);
          paramInt = i;
          break;
        case 9:
          localakx.ptF = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(80075);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80075);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.akx
 * JD-Core Version:    0.6.2
 */