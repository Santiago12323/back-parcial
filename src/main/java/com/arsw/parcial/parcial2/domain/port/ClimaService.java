package com.arsw.parcial.parcial2.domain.port;

import java.io.IOException;

public interface ClimaService {

    Object getClima(String pais) throws IOException;
}
