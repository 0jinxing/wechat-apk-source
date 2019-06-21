package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class zx extends bsr
{
  public String duc;
  public String dud;
  public String lvz;
  public String wfd;
  public String wfe;
  public long wff;
  public double wfg;
  public double wfh;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56784);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.lvz != null)
        paramArrayOfObject.e(2, this.lvz);
      if (this.dud != null)
        paramArrayOfObject.e(3, this.dud);
      if (this.duc != null)
        paramArrayOfObject.e(4, this.duc);
      if (this.wfd != null)
        paramArrayOfObject.e(5, this.wfd);
      if (this.wfe != null)
        paramArrayOfObject.e(6, this.wfe);
      paramArrayOfObject.ai(7, this.wff);
      paramArrayOfObject.f(8, this.wfg);
      paramArrayOfObject.f(9, this.wfh);
      AppMethodBeat.o(56784);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label790;
    label790: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.lvz != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.lvz);
      i = paramInt;
      if (this.dud != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.dud);
      paramInt = i;
      if (this.duc != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.duc);
      i = paramInt;
      if (this.wfd != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wfd);
      paramInt = i;
      if (this.wfe != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wfe);
      paramInt = paramInt + e.a.a.b.b.a.o(7, this.wff) + (e.a.a.b.b.a.fv(8) + 8) + (e.a.a.b.b.a.fv(9) + 8);
      AppMethodBeat.o(56784);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56784);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        zx localzx = (zx)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56784);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localzx.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(56784);
          paramInt = i;
          break;
        case 2:
          localzx.lvz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56784);
          paramInt = i;
          break;
        case 3:
          localzx.dud = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56784);
          paramInt = i;
          break;
        case 4:
          localzx.duc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56784);
          paramInt = i;
          break;
        case 5:
          localzx.wfd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56784);
          paramInt = i;
          break;
        case 6:
          localzx.wfe = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56784);
          paramInt = i;
          break;
        case 7:
          localzx.wff = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56784);
          paramInt = i;
          break;
        case 8:
          localzx.wfg = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(56784);
          paramInt = i;
          break;
        case 9:
          localzx.wfh = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(56784);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56784);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.zx
 * JD-Core Version:    0.6.2
 */