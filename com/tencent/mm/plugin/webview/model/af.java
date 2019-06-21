package com.tencent.mm.plugin.webview.model;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bew;
import com.tencent.mm.protocal.protobuf.buj;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public final class af
{
  private static String[] umc;
  private static boolean umd = false;

  private static LinkedList<buj> Z(ArrayList<byte[]> paramArrayList)
  {
    AppMethodBeat.i(6674);
    LinkedList localLinkedList = new LinkedList();
    if ((paramArrayList == null) || (paramArrayList.isEmpty()))
      AppMethodBeat.o(6674);
    while (true)
    {
      return localLinkedList;
      int i = 0;
      while (true)
      {
        if (i >= paramArrayList.size())
          break label162;
        try
        {
          bew localbew = new com/tencent/mm/protocal/protobuf/bew;
          localbew.<init>();
          localbew.parseFrom((byte[])paramArrayList.get(i));
          buj localbuj = new com/tencent/mm/protocal/protobuf/buj;
          localbuj.<init>();
          localbuj.wWa = localbew.wIR;
          localbuj.Desc = localbew.desc;
          localbuj.vOF = localbew.scope;
          localbuj.iyZ = localbew.iyZ;
          localLinkedList.add(localbuj);
          i++;
        }
        catch (IOException paramArrayList)
        {
          ab.w("MicroMsg.OauthAuthorizeLogic", "bytesListToBytesListScopeInfoList: i:%d, exp:%s", new Object[] { Integer.valueOf(i), paramArrayList.getLocalizedMessage() });
          localLinkedList.clear();
          AppMethodBeat.o(6674);
        }
      }
      continue;
      label162: AppMethodBeat.o(6674);
    }
  }

  private static ArrayList<byte[]> az(LinkedList<bew> paramLinkedList)
  {
    AppMethodBeat.i(6673);
    ArrayList localArrayList = new ArrayList();
    if ((paramLinkedList == null) || (paramLinkedList.isEmpty()))
      AppMethodBeat.o(6673);
    while (true)
    {
      return localArrayList;
      int i = 0;
      while (true)
      {
        if (i >= paramLinkedList.size())
          break label104;
        try
        {
          localArrayList.add(((bew)paramLinkedList.get(i)).toByteArray());
          i++;
        }
        catch (IOException paramLinkedList)
        {
          ab.w("MicroMsg.OauthAuthorizeLogic", "oauthScopeInfoListToBytesList index:%d, exp:%s ", new Object[] { Integer.valueOf(i), paramLinkedList.getLocalizedMessage() });
          localArrayList.clear();
          AppMethodBeat.o(6673);
        }
      }
      continue;
      label104: AppMethodBeat.o(6673);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.af
 * JD-Core Version:    0.6.2
 */