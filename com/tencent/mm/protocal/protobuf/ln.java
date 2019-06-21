package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class ln extends bsr
{
  public String pPZ;
  public String vFb;
  public String vFc;
  public String vFd;
  public int vFg;
  public b vPe;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56716);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vFb != null)
        paramArrayOfObject.e(2, this.vFb);
      if (this.vFc != null)
        paramArrayOfObject.e(3, this.vFc);
      if (this.pPZ != null)
        paramArrayOfObject.e(4, this.pPZ);
      paramArrayOfObject.iz(5, this.vFg);
      if (this.vPe != null)
        paramArrayOfObject.c(6, this.vPe);
      if (this.vFd != null)
        paramArrayOfObject.e(7, this.vFd);
      AppMethodBeat.o(56716);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label693;
    label693: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vFb != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vFb);
      paramInt = i;
      if (this.vFc != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vFc);
      i = paramInt;
      if (this.pPZ != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.pPZ);
      i += e.a.a.b.b.a.bs(5, this.vFg);
      paramInt = i;
      if (this.vPe != null)
        paramInt = i + e.a.a.b.b.a.b(6, this.vPe);
      i = paramInt;
      if (this.vFd != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.vFd);
      AppMethodBeat.o(56716);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56716);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ln localln = (ln)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56716);
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
            localln.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(56716);
          paramInt = i;
          break;
        case 2:
          localln.vFb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56716);
          paramInt = i;
          break;
        case 3:
          localln.vFc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56716);
          paramInt = i;
          break;
        case 4:
          localln.pPZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56716);
          paramInt = i;
          break;
        case 5:
          localln.vFg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56716);
          paramInt = i;
          break;
        case 6:
          localln.vPe = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(56716);
          paramInt = i;
          break;
        case 7:
          localln.vFd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56716);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56716);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ln
 * JD-Core Version:    0.6.2
 */