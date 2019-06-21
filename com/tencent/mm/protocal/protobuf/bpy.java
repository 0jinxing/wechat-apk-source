package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bpy extends com.tencent.mm.bt.a
{
  public String wSh;
  public String wSi;
  public int wSj;
  public int wSk = 0;
  public String wSl;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(124336);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wSh != null)
        paramArrayOfObject.e(1, this.wSh);
      if (this.wSi != null)
        paramArrayOfObject.e(2, this.wSi);
      paramArrayOfObject.iz(3, this.wSj);
      paramArrayOfObject.iz(4, this.wSk);
      if (this.wSl != null)
        paramArrayOfObject.e(5, this.wSl);
      AppMethodBeat.o(124336);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wSh == null)
        break label447;
    label447: for (paramInt = e.a.a.b.b.a.f(1, this.wSh) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wSi != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wSi);
      i = i + e.a.a.b.b.a.bs(3, this.wSj) + e.a.a.b.b.a.bs(4, this.wSk);
      paramInt = i;
      if (this.wSl != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wSl);
      AppMethodBeat.o(124336);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124336);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bpy localbpy = (bpy)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124336);
          break;
        case 1:
          localbpy.wSh = locala.BTU.readString();
          AppMethodBeat.o(124336);
          paramInt = i;
          break;
        case 2:
          localbpy.wSi = locala.BTU.readString();
          AppMethodBeat.o(124336);
          paramInt = i;
          break;
        case 3:
          localbpy.wSj = locala.BTU.vd();
          AppMethodBeat.o(124336);
          paramInt = i;
          break;
        case 4:
          localbpy.wSk = locala.BTU.vd();
          AppMethodBeat.o(124336);
          paramInt = i;
          break;
        case 5:
          localbpy.wSl = locala.BTU.readString();
          AppMethodBeat.o(124336);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(124336);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bpy
 * JD-Core Version:    0.6.2
 */