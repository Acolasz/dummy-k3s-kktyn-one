package hu.kukutyin.dummy.k3s.kktyn.one.service.app.api;

import lombok.extern.slf4j.Slf4j;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import hu.kukutyin.dummy.k3s.kktyn.one.service.app.domain.ConstantsResponse;

@Slf4j
@Service
public class ConstantsServiceApiDelegateImpl implements ConstantsServiceApiDelegate {

    /**
     * GET /dummy
     *
     * @param groupId    Constants: groupId (required)
     * @param groupIdKey Constants: groupIdKey (required)
     * @return Success. (status code 200)
     * or Invalid (status code 403)
     * or Invalid (status code 404)
     * or Internal server error. (status code 500)
     * @see ConstantsServiceApi#constantsService
     */
    @Override
    public ResponseEntity<ConstantsResponse> constantsService(
            String groupId,
            String groupIdKey
    ) {
            return ResponseEntity.ok(new ConstantsResponse().groupIdValue("abc123"));
    }
}
