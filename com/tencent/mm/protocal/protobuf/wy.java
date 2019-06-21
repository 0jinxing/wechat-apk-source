package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class wy extends com.tencent.mm.bt.a
{
  public String desc;
  public String detail;
  public String title;
  public String url;
  public LinkedList<String> wcS;
  public String wcT;

  public wy()
  {
    AppMethodBeat.i(89061);
    this.wcS = new LinkedList();
    AppMethodBeat.o(89061);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89062);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.title != null)
        paramArrayOfObject.e(1, this.title);
      if (this.url != null)
        paramArrayOfObject.e(2, this.url);
      if (this.desc != null)
        paramArrayOfObject.e(3, this.desc);
      paramArrayOfObject.e(4, 1, this.wcS);
      if (this.detail != null)
        paramArrayOfObject.e(5, this.detail);
      if (this.wcT != null)
        paramArrayOfObject.e(6, this.wcT);
      AppMethodBeat.o(89062);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.title == null)
        break label546;
    label546: for (i = e.a.a.b.b.a.f(1, this.title) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.url != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.url);
      i = paramInt;
      if (this.desc != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.desc);
      i += e.a.a.a.c(4, 1, this.wcS);
      paramInt = i;
      if (this.detail != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.detail);
      i = paramInt;
      if (this.wcT != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wcT);
      AppMethodBeat.o(89062);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wcS.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89062);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        wy localwy = (wy)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89062);
          break;
        case 1:
          localwy.title = locala.BTU.readString();
          AppMethodBeat.o(89062);
          paramInt = i;
          break;
        case 2:
          localwy.url = locala.BTU.readString();
          AppMethodBeat.o(89062);
          paramInt = i;
          break;
        case 3:
          localwy.desc = locala.BTU.readString();
          AppMethodBeat.o(89062);
          paramInt = i;
          break;
        case 4:
          localwy.wcS.add(locala.BTU.readString());
          AppMethodBeat.o(89062);
          paramInt = i;
          break;
        case 5:
          localwy.detail = locala.BTU.readString();
          AppMethodBeat.o(89062);
          paramInt = i;
          break;
        case 6:
          localwy.wcT = locala.BTU.readString();
          AppMethodBeat.o(89062);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89062);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.wy
 * JD-Core Version:    0.6.2
 */