package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cxv extends com.tencent.mm.bt.a
{
  public String Md5;
  public int vMG;
  public cxp xsZ;
  public String xtn;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(115022);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xsZ != null)
      {
        paramArrayOfObject.iy(1, this.xsZ.computeSize());
        this.xsZ.writeFields(paramArrayOfObject);
      }
      if (this.xtn != null)
        paramArrayOfObject.e(2, this.xtn);
      paramArrayOfObject.iz(3, this.vMG);
      if (this.Md5 != null)
        paramArrayOfObject.e(4, this.Md5);
      AppMethodBeat.o(115022);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xsZ == null)
        break label497;
    label497: for (paramInt = e.a.a.a.ix(1, this.xsZ.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.xtn != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.xtn);
      i += e.a.a.b.b.a.bs(3, this.vMG);
      paramInt = i;
      if (this.Md5 != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.Md5);
      AppMethodBeat.o(115022);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(115022);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cxv localcxv = (cxv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(115022);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cxp();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((cxp)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcxv.xsZ = ((cxp)localObject1);
          }
          AppMethodBeat.o(115022);
          paramInt = i;
          break;
        case 2:
          localcxv.xtn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(115022);
          paramInt = i;
          break;
        case 3:
          localcxv.vMG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(115022);
          paramInt = i;
          break;
        case 4:
          localcxv.Md5 = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(115022);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(115022);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cxv
 * JD-Core Version:    0.6.2
 */