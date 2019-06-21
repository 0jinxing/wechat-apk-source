package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class clg extends bsr
{
  public int nda;
  public int ptw;
  public int ptx;
  public int pty;
  public SKBuiltinBuffer_t ptz;
  public bts xiT;
  public bts xiU;
  public int xiV;
  public int xiW;
  public int xiX;
  public int xiY;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(116809);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xiT == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ClientMediaId");
        AppMethodBeat.o(116809);
        throw paramArrayOfObject;
      }
      if (this.xiU == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: DataMD5");
        AppMethodBeat.o(116809);
        throw paramArrayOfObject;
      }
      if (this.ptz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Data");
        AppMethodBeat.o(116809);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.xiT != null)
      {
        paramArrayOfObject.iy(2, this.xiT.computeSize());
        this.xiT.writeFields(paramArrayOfObject);
      }
      if (this.xiU != null)
      {
        paramArrayOfObject.iy(3, this.xiU.computeSize());
        this.xiU.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(4, this.ptw);
      paramArrayOfObject.iz(5, this.ptx);
      paramArrayOfObject.iz(6, this.pty);
      if (this.ptz != null)
      {
        paramArrayOfObject.iy(7, this.ptz.computeSize());
        this.ptz.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(8, this.nda);
      paramArrayOfObject.iz(9, this.xiV);
      paramArrayOfObject.iz(10, this.xiW);
      paramArrayOfObject.iz(11, this.xiX);
      paramArrayOfObject.iz(12, this.xiY);
      AppMethodBeat.o(116809);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1317;
    label1317: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.xiT != null)
        paramInt = i + e.a.a.a.ix(2, this.xiT.computeSize());
      i = paramInt;
      if (this.xiU != null)
        i = paramInt + e.a.a.a.ix(3, this.xiU.computeSize());
      i = i + e.a.a.b.b.a.bs(4, this.ptw) + e.a.a.b.b.a.bs(5, this.ptx) + e.a.a.b.b.a.bs(6, this.pty);
      paramInt = i;
      if (this.ptz != null)
        paramInt = i + e.a.a.a.ix(7, this.ptz.computeSize());
      paramInt = paramInt + e.a.a.b.b.a.bs(8, this.nda) + e.a.a.b.b.a.bs(9, this.xiV) + e.a.a.b.b.a.bs(10, this.xiW) + e.a.a.b.b.a.bs(11, this.xiX) + e.a.a.b.b.a.bs(12, this.xiY);
      AppMethodBeat.o(116809);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xiT == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ClientMediaId");
          AppMethodBeat.o(116809);
          throw paramArrayOfObject;
        }
        if (this.xiU == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: DataMD5");
          AppMethodBeat.o(116809);
          throw paramArrayOfObject;
        }
        if (this.ptz == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Data");
          AppMethodBeat.o(116809);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(116809);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        clg localclg = (clg)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(116809);
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
            localclg.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(116809);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localclg.xiT = paramArrayOfObject;
          }
          AppMethodBeat.o(116809);
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
            localclg.xiU = paramArrayOfObject;
          }
          AppMethodBeat.o(116809);
          paramInt = i;
          break;
        case 4:
          localclg.ptw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116809);
          paramInt = i;
          break;
        case 5:
          localclg.ptx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116809);
          paramInt = i;
          break;
        case 6:
          localclg.pty = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116809);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localclg.ptz = paramArrayOfObject;
          }
          AppMethodBeat.o(116809);
          paramInt = i;
          break;
        case 8:
          localclg.nda = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116809);
          paramInt = i;
          break;
        case 9:
          localclg.xiV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116809);
          paramInt = i;
          break;
        case 10:
          localclg.xiW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116809);
          paramInt = i;
          break;
        case 11:
          localclg.xiX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116809);
          paramInt = i;
          break;
        case 12:
          localclg.xiY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116809);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(116809);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.clg
 * JD-Core Version:    0.6.2
 */