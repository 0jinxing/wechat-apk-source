package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ur extends bsr
{
  public int iAd;
  public String nSd;
  public String vYh;
  public String vYl;
  public String wcg;
  public long wch;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48828);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wcg != null)
        paramArrayOfObject.e(2, this.wcg);
      paramArrayOfObject.ai(3, this.wch);
      if (this.vYh != null)
        paramArrayOfObject.e(4, this.vYh);
      if (this.vYl != null)
        paramArrayOfObject.e(5, this.vYl);
      paramArrayOfObject.iz(6, this.iAd);
      if (this.nSd != null)
        paramArrayOfObject.e(7, this.nSd);
      AppMethodBeat.o(48828);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label673;
    label673: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wcg != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wcg);
      i += e.a.a.b.b.a.o(3, this.wch);
      paramInt = i;
      if (this.vYh != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vYh);
      i = paramInt;
      if (this.vYl != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vYl);
      i += e.a.a.b.b.a.bs(6, this.iAd);
      paramInt = i;
      if (this.nSd != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.nSd);
      AppMethodBeat.o(48828);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48828);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ur localur = (ur)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48828);
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
            localur.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(48828);
          paramInt = i;
          break;
        case 2:
          localur.wcg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48828);
          paramInt = i;
          break;
        case 3:
          localur.wch = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(48828);
          paramInt = i;
          break;
        case 4:
          localur.vYh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48828);
          paramInt = i;
          break;
        case 5:
          localur.vYl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48828);
          paramInt = i;
          break;
        case 6:
          localur.iAd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48828);
          paramInt = i;
          break;
        case 7:
          localur.nSd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48828);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48828);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ur
 * JD-Core Version:    0.6.2
 */